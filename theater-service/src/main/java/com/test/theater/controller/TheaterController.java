package com.test.theater.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.theater.dto.Theater;
import com.test.theater.service.TheaterService;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class TheaterController {

	@Autowired private TheaterService theaterService;
	  
    // Save operation
    @PostMapping("/onboardTheater")
    public Theater saveTheater(
        @Valid @RequestBody Theater theater)
    {
        return theaterService.saveTheater(theater);
    }
  
    // Read operation
    @GetMapping("/theaters")
    public List<Theater> fetchTheaterList()
    {
        return theaterService.fetchTheaterList();
    }
  
    // Update operation
    @PutMapping("/theaters/{id}")
    public Theater updateTheater(@RequestBody Theater theater, @PathVariable("id") Long theaterId)
    {
        return theaterService.updateTheater(theater, theaterId);
    }
  
    // Delete operation
    @DeleteMapping("/theaters/{id}")
    public String deleteTheaterById(@PathVariable("id") Long theaterId)
    {
    		theaterService.deleteTheaterById(theaterId);
  
        return "Deleted Successfully";
    }

}