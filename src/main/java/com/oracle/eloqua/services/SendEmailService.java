package com.oracle.eloqua.services;

import java.util.List;
import java.util.Map;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

	public void sendEmail(Message<List<Map<String, Object>>> msg){
		
		List<Map<String, Object>> rows = msg.getPayload();
        for (Map<String, Object> row : rows) {
            int id = (int) row.get("id");
            String name = (String) row.get("name");
            String email = (String) row.get("email");
	        System.out.println("################################");
	        System.out.println("################################");
	        System.out.println("################################");
	        System.out.println("##  Hello " + id + "-" + name + "-" + email + "!!!" );
	        System.out.println("################################");
	        System.out.println("################################");
	        System.out.println("################################");
        }   
    }
}
