package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.IStageRepository;

@Service
public class StageService {

	@Autowired
	public IStageRepository repo;
	
	public void Save() {
		
	}
}
