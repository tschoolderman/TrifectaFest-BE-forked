package com.example.demo.entiteien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	private int artistId;
	
//	private int stageId;
	
	private String Synopsis;
	
	private boolean needVj;
	
}
