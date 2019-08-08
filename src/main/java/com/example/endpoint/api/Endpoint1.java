package com.example.endpoint.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.endpoint.api.dto.endpoint1.SingUp;
import com.example.endpoint.model.Data;
import com.example.endpoint.repository.DataRepository;

@RequestMapping("/endpoint1")
@RestController
public class Endpoint1 {

	@Autowired
	private DataRepository dataRepository;
	
	@PostMapping("/singup")
	public void singUp(@RequestBody SingUp singUp) {
		dataRepository.save(new Data(singUp.getDataValue(), "endpoint1"));
	}
	
}
