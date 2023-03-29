package com.example.demo.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.ApplicationE;


@Service
public class ApplicationEService {
	
	@Autowired
	public ApplicationERepository repo;
	
	public void goeienaam() {
		repo.save(new ApplicationE());
	}
}
