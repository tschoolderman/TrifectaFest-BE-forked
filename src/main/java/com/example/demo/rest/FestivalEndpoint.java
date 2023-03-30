package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiteien.Festival;
import com.example.demo.persistance.IFestivalRepository;
import com.example.demo.service.FestivalService;

@RestController
public class FestivalEndpoint {
	
	@Autowired
	IFestivalRepository repo;
	
	@Autowired
	FestivalService service;

	@GetMapping("api/festival/newempty")
	public void SaveEmpty() {
		repo.save(new Festival());
	}
	
	@RequestMapping(method=RequestMethod.POST, value="api/festival/new")
	public boolean saveNew(@RequestBody Festival f) {
		 repo.save(f);
		 return true;
	}
	
	@GetMapping("api/festival/all")
	public List<Festival> getAll() {
		return repo.findAll();
	}
	
	@GetMapping("api/festival/get/{id}")
	public Festival getById(@PathVariable long id) {
		return repo.findById(id).get();
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="api/festival/update/{id}")
	public boolean update(@RequestBody Festival f, @PathVariable long id) {
		Festival festival = repo.findById(id).get();
		festival.setBeginDate(f.getBeginDate());
		festival.setEndDate(f.getEndDate());
		festival.setName(f.getName());
		festival.setOrganizer(f.getOrganizer());
		repo.save(festival);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="api/festival/delete/{id}")
	public boolean delete( @PathVariable long id) {
		repo.delete(repo.findById(id).get());
		return true;
	}
	
	@GetMapping("api/festival/organizer/{festivalid}/{organizerid}")
	public String addOrganizer(@PathVariable("festivalid") long festivalid, @PathVariable("organizerid") long organizerid) {
		System.out.println(festivalid);
		System.out.println(organizerid);
		service.voegtoe(festivalid, organizerid);
		return "";
	}
		

}
