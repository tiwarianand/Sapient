package com.test.movies.service;

import java.util.List;

import com.test.movies.entity.Movie;


public interface MovieService {

	// Save operation
	Movie saveMovie(Movie movie);
  
    // Read operation
    List<Movie> fetchMovieList();
  
    // Update operation
    Movie updateMovie(Movie movie,Long movieId);
  
    // Delete operation
    void deleteMovieById(Long movieId);
}
