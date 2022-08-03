package com.test.movies.controller;

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

import com.test.movies.entity.Movie;
import com.test.movies.service.MovieService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class MovieController {

	@Autowired private MovieService movieService;
	
	// Save operation
    @PostMapping("/addMovie")
    public Movie saveMovie(@Valid @RequestBody Movie movie)
    {
        return movieService.saveMovie(movie);
    }
    
    // Get operation
    @GetMapping("/movies")
    public List<Movie> fetchMovieList()
    {
        return movieService.fetchMovieList();
    }
    
    // Update operation
    @PutMapping("/movies/{id}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable("id") Long movieId)
    {
        return movieService.updateMovie(movie, movieId);
    }
  
    // Delete operation
    @DeleteMapping("/movies/{id}")
    public String deleteMovieById(@PathVariable("id") Long movieId)
    {
    		movieService.deleteMovieById(movieId);
  
        return "Deleted Successfully";
    }
}
