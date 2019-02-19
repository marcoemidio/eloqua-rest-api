package com.oracle.eloqua.domain;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "email_tbl")
public class EmailDeployment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String status;
	private String name;
	private String type;
	private String payload;
	
	//default constructor
	public EmailDeployment() {
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayload() {
		return payload;
	}

	public void setEmail(String payload) {
		this.payload = payload;
	}*/
	
}