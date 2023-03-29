package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ArtistService;

@RestController
public class ArtistEndpoint {
	@Autowired
	ArtistService service;

	@GetMapping("saveemptyartist")
	public void SaveEmpty() {
		System.out.println("we zijn in het endpoint");
		service.save();
	}
}
