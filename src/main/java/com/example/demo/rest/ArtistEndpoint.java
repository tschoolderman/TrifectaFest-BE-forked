package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiteien.Artist;
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
	
	@RequestMapping(method=RequestMethod.POST, value="artist/new")
	public boolean SaveNew(@RequestBody Artist a) {
		return service.save(a);
	}
	
	@GetMapping("artists")
	public List<Artist> getAll() {
		return service.findAll();
	}
	
	@GetMapping("artist/{id}")
	public Artist getById(@PathVariable long id) {
		return service.findById(id);
	}
}
