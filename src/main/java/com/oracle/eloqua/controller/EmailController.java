package com.oracle.eloqua.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.eloqua.beans.EmailLowVolumeDeployment;
import com.oracle.eloqua.domain.EmailDeployment;
import com.oracle.eloqua.handler.RestTemplateResponseErrorHandler;
import com.oracle.eloqua.repository.EmailDeploymentRepository;


@RestController
public class EmailController {

	private static final Logger log = LoggerFactory.getLogger(EmailController.class);

	@Value("${operations.serviceurl.post.assetsemaildeployment}")
	String assetsEmailDeploymentUrl; 
	
	@Value("${operations.authorizationtoken}")
	String token;
	
	//@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	EmailDeploymentRepository emailDeploymentRepository;
	
	public EmailController(RestTemplateBuilder restTemplateBuilder, 
			@Value("${operations.username}") String username,
			@Value("${operations.password}") String password) {
		
		// adds basic authentication do RestTemplate
		this.restTemplate = restTemplateBuilder.basicAuthentication(username, password).build();
		
		// adds custom response error handler to RestTemplate
		this.restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
	}
	
	@RequestMapping(value="/assets/email/{id}", method = RequestMethod.GET)
	public String postEmailDeployment(@PathVariable int id) 
			throws JsonParseException, IOException {

		EmailDeployment record = emailDeploymentRepository.findById(id);
		
		log.info("##  GET request email " + id + " - " + record.getName() + " - " + record.getPayload());
		
		ObjectMapper mapper = new ObjectMapper();		
		EmailLowVolumeDeployment requestPayload = mapper.readValue(record.getPayload(), EmailLowVolumeDeployment.class);
		
        ResponseEntity<String> response = restTemplate.postForEntity(assetsEmailDeploymentUrl, requestPayload, String.class);
        
        log.info(response.getStatusCode().toString());
        log.info(response.getBody());
        
        record.setStatus(response.getStatusCode().toString());
        
        emailDeploymentRepository.save(record);
        
        return response.getBody();
        
	}	

}

