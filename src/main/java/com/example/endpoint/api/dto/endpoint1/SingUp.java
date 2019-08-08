package com.example.endpoint.api.dto.endpoint1;

import com.example.endpoint.api.dto.Dto;

public class SingUp implements Dto {

	private String id;
	private String name;
	
	public SingUp() {
	}
	
	public SingUp(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDataValue() {
		return String.format("SING_UP { id: %s, name: %s }", id, name);
	}	
	
}
