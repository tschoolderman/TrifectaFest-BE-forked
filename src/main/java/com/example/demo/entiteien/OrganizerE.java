package com.example.demo.entiteien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Entity
public class OrganizerE extends Person {


	@Override
	public PersonRole getRole() {
		// TODO Auto-generated method stub
		return PersonRole.Organizer;
	}
}
