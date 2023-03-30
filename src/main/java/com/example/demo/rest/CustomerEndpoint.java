package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiteien.Customer;
import com.example.demo.persistance.ICustomerRepository;

@RestController
public class CustomerEndpoint {

	@Autowired
	private ICustomerRepository repo;

	@GetMapping("/api/customer/saveempty")
	public void saveEmpty() {
		System.out.println("we zijn in het endpoint");
		repo.save(new Customer());
	}

	@RequestMapping(method = RequestMethod.POST, value = "/api/customer/new")
	public void create(@RequestBody Customer a) {
		repo.save(a);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/api/customer/{id}")
	public boolean update(@RequestBody Customer a, @PathVariable long id) {
		Customer customer = repo.findById(id).get();
		customer.setGender(a.getGender());
		customer.setAge(a.getAge());
		customer.setRegion(a.getRegion());
		customer.setPhoneNumber(a.getPhoneNumber());
		customer.setFavoriteBand(a.getFavoriteBand());

		repo.save(customer);
		return true;
	}

	@GetMapping("/api/customer/all")
	public List<Customer> getAll() {
		return repo.findAll();
	}

	@GetMapping("customer/{id}")
	public Customer getById(@PathVariable long id) {
		return repo.findById(id).get();
	}

}
