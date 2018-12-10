package com.oracle.eloqua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ImportResource("classpath:jdbcInputApplicationContext.xml")
public class EloquaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EloquaRestApiApplication.class, args);
	}
}
