package com.example.demo.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageService {

	@Autowired
	public IStageRepository repo;
	
	public void Save() {
		
	}
}
