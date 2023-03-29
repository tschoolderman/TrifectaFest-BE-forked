package com.example.demo.persistance;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entiteien.Artist;

public interface IArtistRepository extends CrudRepository<Artist, Long> {

	
}
