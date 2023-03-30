package com.example.demo.service;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.ICustomerRepository;
import com.example.demo.entiteien.Artist;
import com.example.demo.entiteien.Customer;
import com.example.demo.entiteien.GenderType;
import com.example.demo.entiteien.Ticket;

@Service
public class CustomerService {

	@Autowired
	private ICustomerRepository repo;
	
	public void save() {
		repo.save(new Customer());
	}
	
	public boolean save(Customer a) {
		repo.save(a);
		return true;
	}
	
	public List<Customer> findAll(){
		return repo.findAll();
	}
	
	public Customer findById(long id) {
		return repo.findById(id).get();
	}
	
	public boolean update(Customer a, long id) {
		Customer customer = repo.findById(id).get();
		
//		private GenderType gender;
//		private int age;
//		private String region;	
//		private int phoneNumber;
//		private String favoriteBand;
//		private List<Ticket> tickets;
		
		repo.save(customer);
		return true;
	}
	
	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}
	
}
