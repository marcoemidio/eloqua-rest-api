package com.oracle.eloqua;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import io.jaegertracing.Configuration;

@SpringBootApplication
//@ImportResource("classpath:META-INF/jdbcInputApplicationContext.xml")
public class EloquaRestApiApplication {
	
	@Value("${jaeger.service.name}")
	private String jaegerServiceName;
	
	@Bean
	public io.opentracing.Tracer jaegerTracer() {
		return new Configuration(jaegerServiceName).getTracer();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EloquaRestApiApplication.class, args);
	}
}
