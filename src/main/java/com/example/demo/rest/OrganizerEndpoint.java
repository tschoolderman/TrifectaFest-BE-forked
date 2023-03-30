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
import com.example.demo.entiteien.Organizer;
import com.example.demo.persistance.IOrganizerRepository;
import com.example.demo.service.ArtistService;

@RestController
public class OrganizerEndpoint {

	@Autowired
	IOrganizerRepository repo;

	@GetMapping("api/organizer/newempty")
	public void SaveEmpty() {
		System.out.println("we zijn in het endpoint");
		repo.save(new Organizer());
	}
	
	@RequestMapping(method=RequestMethod.POST, value="api/organizer/new")
	public boolean saveNew(@RequestBody Organizer o) {
		 repo.save(o);
		 return true;
	}
	
	@GetMapping("api/organizer/all")
	public List<Organizer> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("api/organizer/get/{id}")
	public Organizer getById(@PathVariable long id) {
		return repo.findById(id).get();
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="api/organizer/update/{id}")
	public boolean update(@RequestBody Organizer o, @PathVariable long id) {
		Organizer organizer = repo.findById(id).get();
		organizer.setEmail(o.getEmail());
		organizer.setName(o.getName());
		organizer.setPassword(o.getPassword());
		repo.save(organizer);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="api/organizer/delete/{id}")
	public boolean delete( @PathVariable long id) {
		repo.delete(repo.findById(id).get());
		return true;
	}
}
