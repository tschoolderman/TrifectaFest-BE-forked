package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StageService;

@RestController
public class StageEndpoint {

	@Autowired
	StageService abc;
	
	@GetMapping("xyz")
	public void yyy() {
		System.out.println("ok");
	}
}
