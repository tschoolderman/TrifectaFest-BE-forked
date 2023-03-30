package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.Festival;
import com.example.demo.entiteien.Organizer;
import com.example.demo.persistance.IFestivalRepository;
import com.example.demo.persistance.IOrganizerRepository;

@Service
public class OrganizerService {

	@Autowired
	IOrganizerRepository repo;
	
	@Autowired
	IFestivalRepository festivalRepo;

	public void createFestival(long id, Festival festival) {
		// TODO Auto-generated method stub
		Festival a = festivalRepo.save(festival);//transient
		
		Organizer b = repo.findById(id).get();
		a.setOrganizer(b);
		festivalRepo.save(a);
	}
}
