package com.example.endpoint.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.endpoint.repository.DataRepository;

@Controller
@RequestMapping("/monitor")
public class EndpointMonitor {

	@Autowired
	private DataRepository dataRepository;
	
	@GetMapping("/{endpoint}")
	public String monitoringEndpoint(ModelMap model, @PathVariable String endpoint) {
		model.addAttribute("data", dataRepository.findByEndpoint(endpoint));
		return "monitor";
	}
	
}
