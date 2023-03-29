package com.example.demo.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.Person;


@Service
public class PersonService {
	
	@Autowired
	public IPersonRepository repo;
	
	public void Save() {
	}
}
