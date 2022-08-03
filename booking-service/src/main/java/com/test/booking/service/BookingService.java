package com.test.booking.service;

import java.util.List;

import com.test.booking.entity.Booking;

public interface BookingService {

	public Booking createBooking(Booking booking);
	
	public Booking updateBooking(Booking booking, Long bookingId);
	
	public List<Booking> fetchBookingList();
}
