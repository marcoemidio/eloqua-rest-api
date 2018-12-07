package com.oracle.eloqua.integration.jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;

public class EmailDeploymentJdbcInbound {
	
	public static void main(String[] args) throws InterruptedException, IOException, SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "jdbcInboundApplicationContext.xml");
        try {            
            PollableChannel pollableChannel = (PollableChannel) context.getBean("dataChannel");
            Message<List<Map<String, Object>>> msg = (Message<List<Map<String, Object>>>) pollableChannel.receive(1000);
            List<Map<String, Object>> rows = msg.getPayload();
            for (Map<String, Object> row : rows) {
                int id = (int) row.get("id");
                String name = (String) row.get("name");
                String email = (String) row.get("email");
                System.out.println(id + "-" + name + "-" + email);
            }
        } finally {
            context.close();
        }
    }
}
