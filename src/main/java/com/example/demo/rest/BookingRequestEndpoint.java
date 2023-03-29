package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiteien.BookingRequest;
import com.example.demo.persistance.IBookingRequestRepository;
import com.example.demo.service.BookingRequestService;

@RestController
public class BookingRequestEndpoint {

	@Autowired
	private IBookingRequestRepository repo;
	
	@RequestMapping("/api/bookingRequest/all")
	public List<BookingRequest> findAll(){
		return repo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/bookingrequest")
	public boolean create(@RequestBody BookingRequest f) {
		repo.save(f);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/bookingrequest/{id}")
	public boolean update(@RequestBody BookingRequest f, @PathVariable long id) {
		BookingRequest bookingRequest = repo.findById(id).get();
		bookingRequest.setDay(f.getDay());
		bookingRequest.setTimeSlot(f.getTimeSlot());
		bookingRequest.setHasVj(f.isHasVj());
		bookingRequest.setNeedVj(f.isNeedVj());
		bookingRequest.setStatus(f.getStatus());
		bookingRequest.setSynopsis(f.getSynopsis());
		
		repo.save(bookingRequest);
		return true;
	}
	
	
	
//	@GetMapping("def")
//	public void ghi() {
//		System.out.println("we zijn in het endpoint");
//		abc.goeienaam();
//	}
	
	
}
