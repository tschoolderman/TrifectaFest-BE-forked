package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.Festival;
import com.example.demo.entiteien.Organizer;
import com.example.demo.persistance.IFestivalRepository;
import com.example.demo.persistance.IOrganizerRepository;

@Service
public class FestivalService {

	@Autowired
	IOrganizerRepository organizerRepo;
	
	@Autowired
	IFestivalRepository festivalRepo;
	
	
	
	public void voegtoe(long festivalid, long organizerid) {
		// TODO Auto-generated method stub
		Organizer temp = organizerRepo.findById(organizerid).get();
		Festival festival = festivalRepo.findById(festivalid).get();
		
		festival.setOrganizer(temp);
		festivalRepo.save(festival);
		
	}

	
}
