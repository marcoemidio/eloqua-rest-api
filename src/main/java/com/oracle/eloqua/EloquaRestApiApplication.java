package com.oracle.eloqua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/jdbcInputApplicationContext.xml")
public class EloquaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EloquaRestApiApplication.class, args);
	}
}
