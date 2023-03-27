package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.ApplicationEService;

@RestController
public class ApplicationEEndpoint {

	@Autowired
	ApplicationEService abc;
	
	@GetMapping("def")
	public void ghi() {
		System.out.println("we zijn in het endpoint");
		abc.goeienaam();
	}
}
