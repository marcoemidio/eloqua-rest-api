package com.oracle.eloqua.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class ResponseObject {

	private String message;
	private String uuid;

	public ResponseObject(String message, String uuid) {
		this.message = message;
		this.uuid = uuid;
	}
	
}