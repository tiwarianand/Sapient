package com.test.theater.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.theater.dto.Theater;
import com.test.theater.entity.TheaterEntity;
import com.test.theater.repository.TheaterRepository;
import com.test.theater.service.TheaterService;
import com.test.theater.util.TheaterUtil;

public class TheaterServiceImpl implements TheaterService {

	@Autowired
	private TheaterRepository theaterRepository;

	// Save operation
	@Override
	public Theater saveTheater(Theater theater)
	{
	    return TheaterUtil.convertToDto(theaterRepository.save(TheaterUtil.convertToEntity(theater)));
	}

	// Read operation
	@Override public List<Theater> fetchTheaterList()
	{
	    return TheaterUtil.convertToDtoList((List<TheaterEntity>)theaterRepository.findAll());
	}

	// Update operation
	@Override
	public Theater updateTheater(Theater theater, Long theaterId)
	{
		TheaterEntity theaterDb = theaterRepository.findById(theaterId).get();
	
	    if (Objects.nonNull(theater.getTheaterName()) && !"".equalsIgnoreCase(theater.getTheaterName())) {
	    		theaterDb.setTheaterName(theater.getTheaterName());
	    }
	
	    if (theater.getTotalSeatingCapacity() != 0) {
    			theaterDb.setTotalSeatingCapacity(theater.getTotalSeatingCapacity());
	    }
	    
	    if (theater.getRemainingSeatingCapacity() != -1) {
			theaterDb.setRemainingSeatingCapacity(theater.getRemainingSeatingCapacity());
	    }
	    
	    if (Objects.nonNull(theater.getAddress())) {
    			theaterDb.setAddress(TheaterUtil.convertToAddressEntity(theater.getAddress()));
	    }
	    
	    return TheaterUtil.convertToDto(theaterRepository.save(theaterDb));
	}

	// Delete operation
	@Override
	public void deleteTheaterById(Long theaterId)
	{
	    theaterRepository.deleteById(theaterId);
	}
}
