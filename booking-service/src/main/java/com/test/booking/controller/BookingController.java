package com.test.booking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.booking.entity.Booking;
import com.test.booking.service.BookingService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class BookingController {

	@Autowired private BookingService bookingService;
	
	// Save operation
    @PostMapping("/createBooking")
    public Booking saveBooking(@Valid @RequestBody Booking booking)
    {
        return bookingService.createBooking(booking);
    }
    
    // Get operation
    @GetMapping("/bookings")
    public List<Booking> fetchBookingist()
    {
        return bookingService.fetchBookingList();
    }
    
    // Update operation
    @PutMapping("/bookings/{id}")
    public Booking updateBooking(@RequestBody Booking booking, @PathVariable("id") Long bookingId)
    {
        return bookingService.updateBooking(booking, bookingId);
    }
	
}
