package com.test.theater.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.test.theater.dto.Address;
import com.test.theater.dto.Theater;
import com.test.theater.entity.AddressEntity;
import com.test.theater.entity.TheaterEntity;


public class TheaterUtil {

    public static TheaterEntity convertToEntity(Theater dto) {
    		TheaterEntity entity = new TheaterEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    public static Theater convertToDto(TheaterEntity entity) {
    		Theater theater = new Theater();
        if (entity != null) {
            BeanUtils.copyProperties(entity, theater);
        }
        return theater;
    }
    
    public static AddressEntity convertToAddressEntity(Address dto) {
    		AddressEntity entity = new AddressEntity();
	    if (dto != null) {
	        BeanUtils.copyProperties(dto, entity);
	    }
	    return entity;
	}
    
    public static List<Theater> convertToDtoList(List<TheaterEntity> entities) {
    		List<Theater> theaters = new ArrayList<Theater>();
    		entities.stream().forEach(entity -> {
    			Theater theater = new Theater();
    		    if (entity != null) {
    		        BeanUtils.copyProperties(entity, theater);
    		    }
    		    theaters.add(theater);
    		});
		
	    return theaters;
	}
}
