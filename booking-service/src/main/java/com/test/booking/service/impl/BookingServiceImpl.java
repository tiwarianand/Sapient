package com.test.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.booking.entity.Booking;
import com.test.booking.repository.BookingRepository;
import com.test.booking.service.BookingService;

public class BookingServiceImpl implements BookingService{
	
	@Autowired BookingRepository bookingRepository;

	@Override
	public Booking createBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public Booking updateBooking(Booking booking, Long bookingId) {
		Booking bookingDb = bookingRepository.getById(bookingId);
		bookingDb.setBookingStatus(booking.getBookingStatus());
		return bookingRepository.save(bookingDb);
	}
	
	@Override
	public List<Booking> fetchBookingList() {
		return bookingRepository.findAll();
	}

}
