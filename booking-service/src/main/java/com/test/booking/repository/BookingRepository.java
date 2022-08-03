package com.test.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.booking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
