package com.oracle.eloqua.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.eloqua.beans.EmailLowVolumeDeployment;
import com.oracle.eloqua.domain.EmailDeployment;
import com.oracle.eloqua.domain.ResponseObject;
import com.oracle.eloqua.exception.EntityNotFoundException;
import com.oracle.eloqua.handler.RestTemplateResponseErrorHandler;
import com.oracle.eloqua.repository.EmailDeploymentRepository;
import com.oracle.eloqua.services.EmailService;

import io.opentracing.Tracer;

@RestController
public class KafkaController {
	
	@Value("${kafka.producer.url}")
	String kafkaProducerUrl;
	
	@Autowired
    private Tracer tracer;
	
	@Autowired
	private EmailService emailService;
	
	private static final Logger log = LoggerFactory.getLogger(KafkaController.class);
	
	private RestTemplate restTemplate;
	
	@Autowired
	EmailDeploymentRepository emailDeploymentRepository;
	
	public KafkaController(RestTemplateBuilder restTemplateBuilder) {
		
		// builds a RestTemplate
		this.restTemplate = restTemplateBuilder.build();
		
		// adds custom response error handler to RestTemplate
		this.restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
		this.restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		
		/*RestTemplate restTemplate = restTemplateBuilder
				.errorHandler(new RestTemplateResponseErrorHandler())
				.messageConverters(new MappingJackson2HttpMessageConverter())
				.build();
*/
	}
	
	protected HttpHeaders getHttpHeaders() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		return requestHeaders;
	}
	
	/**
	 * Invoke Kafka message client
	 * **/
	@RequestMapping(value="/kafka/send/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseObject invokeKafka(@PathVariable int id) throws InterruptedException, RuntimeException, EntityNotFoundException{
		
		String mid = UUID.randomUUID().toString();
		
		//add eloqua.mid to headers
		tracer.activeSpan().setBaggageItem("eloqua.mid", mid);
		tracer.activeSpan().setTag("eloqua.mid", mid);
		
		EmailDeployment record = null;
		
		try {
			record = emailService.getEloquaEmail(id);
		} catch (CannotGetJdbcConnectionException exception) {
			return new ResponseObject("Error connecting database", mid);
		}
		
		log.info("##  GET kafka request - " + record.getPayload());
		
		EmailLowVolumeDeployment emailLowVolumeDeploymentObject = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();		
			emailLowVolumeDeploymentObject = mapper.readValue(record.getPayload(), EmailLowVolumeDeployment.class);
			log.info(emailLowVolumeDeploymentObject.toString());
		} catch (IOException exception) {
			log.error("error searching in database with id '{}' for eloqua.mid '{}'", id, mid);
			return new ResponseObject("Error processing object for ", mid);
		}
		
		
		try {

			HttpEntity<EmailLowVolumeDeployment> request = new HttpEntity<>(emailLowVolumeDeploymentObject, getHttpHeaders());

	        ResponseEntity<String> response = restTemplate.postForEntity(kafkaProducerUrl, request, String.class);
	        
	        log.info("response status code '{}' \nresponse body '{}'", response.getStatusCode().toString(), response.getBody());
	        
	        record.setStatus(response.getStatusCode().toString());
	        
	        emailDeploymentRepository.save(record);
	        
	        return new ResponseObject(response.getBody(), mid);
	        
		} catch (RestClientResponseException exception) {
			log.error("Error received by external service. Status code: '{}'", exception.getRawStatusCode());
			
			return new ResponseObject("Error received by external service. Status code: " + exception.getRawStatusCode(), mid);
		} catch (Exception exception) {
			log.error("Error communicating to KafkaProducer with mid '{}'", mid);
			
			return new ResponseObject("Error communicating to KafkaProducer", mid);
		} 
 
	}

}
