package com.test.booking.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "booking")
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
	
	private Long movieId;
	
	private Long showId;
	
	private Long offerId;
	
	private Long TheaterId;
	
	private Long userId;
	
	private Long transactionId;
	
	private Double bookingAmount;
	
	private List<Integer> selectedSeats;
	
	private BookingStatus bookingStatus;
	
}
