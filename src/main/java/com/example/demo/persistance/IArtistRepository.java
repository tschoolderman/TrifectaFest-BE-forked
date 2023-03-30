package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiteien.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Long> {

	
}
