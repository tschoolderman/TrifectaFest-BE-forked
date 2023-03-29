package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.Person;
import com.example.demo.persistance.IPersonRepository;


@Service
public class PersonService {
	
	@Autowired
	public IPersonRepository repo;
	
	public void Save() {
	}
}
