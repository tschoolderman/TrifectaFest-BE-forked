package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entiteien.Artist;
import com.example.demo.persistance.IArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private IArtistRepository repo;

	public void save() {
		repo.save(new Artist());
	}
	
	public void save(Artist a) {
		repo.save(a);
	}
	
	public List<Artist> findAll(){
		return repo.findAll();
	}
	
	public boolean update(Artist a, long id) {
		Artist artist = repo.findById(id).get();
		
		artist.setName(a.getName());
		artist.setDescription(a.getDescription());
		
		repo.save(artist);
		return true;
	}
	
	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}
	
}
