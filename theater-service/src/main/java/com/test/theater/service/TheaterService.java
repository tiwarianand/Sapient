package com.test.theater.service;

import java.util.List;

import com.test.theater.dto.Theater;

public interface TheaterService {

	// Save operation
	Theater saveTheater(Theater Theater);
  
    // Read operation
    List<Theater> fetchTheaterList();
  
    // Update operation
    Theater updateTheater(Theater Theater,Long TheaterId);
  
    // Delete operation
    void deleteTheaterById(Long TheaterId);
}
