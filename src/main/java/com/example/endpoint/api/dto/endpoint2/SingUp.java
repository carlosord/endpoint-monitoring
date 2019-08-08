package com.example.endpoint.api.dto.endpoint2;

import com.example.endpoint.api.dto.Dto;

public class SingUp implements Dto {

	private String id;
	private String email;
	
	public SingUp() {
	}
	
	public SingUp(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getDataValue() {
		return String.format("SING_UP { id: %s, email: %s }", id, email);
	}	
	
}
