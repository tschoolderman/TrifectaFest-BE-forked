package com.example.demo.entiteien;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private BigDecimal compensation;
	
	@OneToOne(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "booking")
	private BookingRequest bookingRequest;
}
