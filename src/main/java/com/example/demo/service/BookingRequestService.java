package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.BookingRequest;
import com.example.demo.persistance.IBookingRequestRepository;


@Service
public class BookingRequestService {
	
	@Autowired
	public IBookingRequestRepository repo;
	
	
	
	
	public void goeienaam() {
		repo.save(new BookingRequest());
	}
}
