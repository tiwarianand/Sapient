package com.test.show.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.show.entity.Show;
import com.test.show.service.ShowService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class ShowController {

	@Autowired private ShowService showService;
	  
    // Save operation
    @PostMapping("/addShow")
    public Show saveShow(@Valid @RequestBody Show show)
    {
        return showService.saveShow(show);
    }
  
    // Read operation
    @GetMapping("/shows")
    public List<Show> fetchShowList()
    {
        return showService.fetchShowList();
    }
  
    // Update operation
    @PutMapping("/shows/{id}")
    public Show updateShow(@RequestBody Show show, @PathVariable("id") Long showId)
    {
        return showService.updateShow(show, showId);
    }
  
    // Delete operation
    @DeleteMapping("/shows/{id}")
    public String deleteShowById(@PathVariable("id") Long showId)
    {
    		showService.deleteShowById(showId);
  
        return "Deleted Successfully";
    }

}