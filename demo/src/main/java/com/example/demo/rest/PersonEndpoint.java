package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.PersonService;

@RestController
public class PersonEndpoint {

	@Autowired
	PersonService service;
	
	@GetMapping("Saveperson")
	public void save() {
		System.out.println("we zijn in het endpoint");
		service.Save();
	}
	
}
