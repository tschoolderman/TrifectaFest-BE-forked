package com.example.demo.entiteien;

import javax.persistence.Entity;

@Entity
public class CustomerE extends Person {

	@Override
	public PersonRole getRole() {
		// TODO Auto-generated method stub
		return PersonRole.Customer;
	}

}
