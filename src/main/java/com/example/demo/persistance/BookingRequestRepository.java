package com.example.demo.persistance;

import com.example.demo.entiteien.*;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Component;

@Component
public interface BookingRequestRepository extends CrudRepository<BookingRequest , Long > {

}
