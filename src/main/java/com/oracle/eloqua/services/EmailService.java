package com.oracle.eloqua.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmailService {
	
	private static final Logger log = LoggerFactory.getLogger(EmailService.class);
	
	private final RestTemplate restTemplate;
	
	@Value("${operations.serviceurl.get.assetsemaildeploymentid}")
	String assetsEmailDeploymentIdUrl;
	
	// property injection must be done after constructor. solution is to annotate the constructor parasm with @Value 
	public EmailService(RestTemplateBuilder restTemplateBuilder, 
			@Value("${operations.username}") String username,
			@Value("${operations.password}") String password) {
		this.restTemplate = restTemplateBuilder.basicAuthentication(username, password).build();
	}
	
	/*
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.basicAuthentication(username, password).build();
	}*/
	
	// Eloqua HTTP GET method to obtain an e-mail by {id}
	public void getEmailDeployment(Message<List<Map<String, Object>>> msg) throws IOException, IllegalArgumentException{
		
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
	public void postEmailDeployment(Message<List<Map<String, Object>>> msg) throws IOException, IllegalArgumentException{
		
		List<Map<String, Object>> rows = msg.getPayload();
        
		for (Map<String, Object> row : rows) {
            int id = (int) row.get("id");
            String name = (String) row.get("name");
            String payload = (String) row.get("payload");
            log.info("##  polled email " + id + " - " + name + " - " + payload);
	        
	        	        
	        ResponseEntity<String> response = restTemplate.postForEntity(assetsEmailDeploymentIdUrl, payload ,String.class);
	        
	        log.info(response.getStatusCode().toString());
	        log.info(response.getBody());
	        
	        
        }   
    }
}
