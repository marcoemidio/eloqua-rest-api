package com.oracle.eloqua.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
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
import com.oracle.eloqua.repository.EmailDeploymentRepository;


@RestController
public class EmailController {

	private static final Logger log = LoggerFactory.getLogger(EmailController.class);

	@Value("${operations.serviceurl.post.assetsemaildeployment}")
	String assetsEmailDeploymentUrl; 
	
	@Value("${operations.username}")
	String username;
	
	@Value("${operations.password}")
	String password;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EmailDeploymentRepository emailDeploymentRepository;
	
	/*@Autowired
	public void setEmailDeploymentRepository(EmailDeploymentRepository emailDeploymentRepository) {
        this.emailDeploymentRepository = emailDeploymentRepository;
    }*/
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.basicAuthentication(username, password).build();
	}

	
	@RequestMapping(value="/assets/email/{id}", method = RequestMethod.GET)
	public void postEmailDeployment(@PathVariable int id) 
			throws JsonParseException, IOException {
		
		String payload = emailDeploymentRepository.findById(id).getPayload();
		
		ObjectMapper mapper = new ObjectMapper();		
		EmailLowVolumeDeployment requestPayload = mapper.readValue(payload, EmailLowVolumeDeployment.class);
		
        ResponseEntity<String> response = restTemplate.postForEntity(assetsEmailDeploymentUrl, requestPayload, String.class);
        
        log.info(response.getStatusCode().toString());
        log.info(response.getBody());
        
	}	

}

