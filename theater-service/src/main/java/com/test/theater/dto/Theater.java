package com.test.theater.dto;

import lombok.Data;

@Data
public class Theater {

	private String theaterName;
	
	private int totalSeatingCapacity;
	
	private int remainingSeatingCapacity;
	
	private Address address;
	
}
