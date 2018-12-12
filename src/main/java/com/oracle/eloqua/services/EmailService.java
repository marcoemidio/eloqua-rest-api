package com.oracle.eloqua.services;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.oracle.eloqua.beans.EmailLowVolumeDeployment;
import com.oracle.eloqua.domain.EmailDeployment;
import com.oracle.eloqua.handler.RestTemplateResponseErrorHandler;
import com.oracle.eloqua.repository.EmailDeploymentRepository;


@Service
public class EmailService {
	
	private static final Logger log = LoggerFactory.getLogger(EmailService.class);
	
	private RestTemplate restTemplate;
	
	@Autowired
	EmailDeploymentRepository emailDeploymentRepository;
	
	@Value("${operations.serviceurl.get.assetsemaildeploymentid}")
	String assetsEmailDeploymentIdUrl;
	
	@Value("${operations.serviceurl.post.assetsemaildeployment}")
	String assetsEmailDeploymentUrl;
	
	@Value("${operations.authorizationtoken}")
	String token;
	
	protected HttpHeaders getHttpHeaders() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		requestHeaders.set("Authorization", token);
		return requestHeaders;
	}
	
	// property injection must be done after constructor. found solution is to annotate the constructor params with @Value 
	public EmailService(RestTemplateBuilder restTemplateBuilder, 
			@Value("${operations.username}") String username,
			@Value("${operations.password}") String password) {
		
		// adds basic authentication do RestTemplate
		this.restTemplate = restTemplateBuilder.basicAuthentication(username, password).build();
		
		// adds custom response error handler to RestTemplate
		this.restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
		
		this.restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	}

	// Eloqua HTTP GET method to obtain an e-mail by {id}
	public void getEmailDeployment(Message<List<Map<String, Object>>> msg) {
		
		List<Map<String, Object>> rows = msg.getPayload();
        
		for (Map<String, Object> row : rows) {
            int id = (int) row.get("id");
            String name = (String) row.get("name");
            String payload = (String) row.get("payload");
            log.info("##  polled email " + id + " - " + name + " - " + payload);
	        
	        Map<String, Object> params = new HashMap<>();
	        params.put("id", 4);
	        log.info("id: " + id);
	        
	        ResponseEntity<String> response = restTemplate.getForEntity(assetsEmailDeploymentIdUrl, String.class, params);
	        
	        log.info(response.getStatusCode().toString());
	        log.info(response.getBody());

        }   
    }
	
	// Eloqua HTTP POST method to send an e-mail
	public void postEmailDeployment(Message<List<Map<String, Object>>> msg) {
		List<Map<String, Object>> rows = msg.getPayload();
		
		for (Map<String, Object> row : rows) {
			int id = (int) row.get("id");
            String name = (String) row.get("name");
            String payload = (String) row.get("payload");
            log.info("##  polled email " + id + " - " + name + " - " + payload);
    		
            try {            
	    		ObjectMapper mapper = new ObjectMapper();
	    		EmailLowVolumeDeployment requestPayload = mapper.readValue(payload, EmailLowVolumeDeployment.class);
	    		
	    		log.info(requestPayload.toString());
	    		
	    		HttpEntity<EmailLowVolumeDeployment> httpEntity = new HttpEntity<>(requestPayload, getHttpHeaders());
	    		
	            ResponseEntity<String> response = restTemplate.exchange(assetsEmailDeploymentUrl, HttpMethod.POST, httpEntity, String.class);
		        
		        log.info(response.getStatusCode().toString());
		        log.info(response.getBody());
		        
		        // validate later gateway usage to update database through gateway and outbound-channel
		        
		        EmailDeployment record = emailDeploymentRepository.findById(id);
		        record.setStatus(response.getStatusCode().toString());
		        
		        emailDeploymentRepository.save(record);
		        
			} catch (JsonGenerationException e) {
				log.info("Error generating JSON object: " + e.getMessage());
			} catch (JsonMappingException e) {
				log.info("Error mapping JSON object: " + e.getMessage());
			} catch (IOException e) {
				log.info("IOException : " + e.getMessage());
			}
	        
        }   
		
    }
	
}
