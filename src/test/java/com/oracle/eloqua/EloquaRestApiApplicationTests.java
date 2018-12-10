package com.oracle.eloqua;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.oracle.eloqua.domain.EmailDeployment;
import com.oracle.eloqua.repository.EmailDeploymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EloquaRestApiApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(EloquaRestApiApplicationTests.class);
	
	/*@Autowired
	private EmailDeploymentRepository emailDeploymentRepository;*/
	
	@Test
	public void contextLoads() {
	}
	
	/*@Test
	public void testFetchData() {
		// Test data retrieval 
		log.info("Test data retrieval");
		EmailDeployment record = emailDeploymentRepository.findByName("REST Low Volume 01");
		
		log.info("Found email with id: " + record.getId() );
		
		assertNotNull(record);
		
		// Get all e-mails, list should only have two
		Iterable<EmailDeployment> records = emailDeploymentRepository.findAll();
		int count = 0;
		for (EmailDeployment r : records) {
			count++;
		}
		assertEquals(count, 2);
	}*/
}
