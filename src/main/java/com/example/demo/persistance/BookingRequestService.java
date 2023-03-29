package com.example.demo.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiteien.BookingRequest;


@Service
public class BookingRequestService {
	
	@Autowired
	public BookingRequestRepository repo;
	
	public void goeienaam() {
		repo.save(new BookingRequest());
	}
}