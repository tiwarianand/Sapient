package com.test.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.movies.entity.Movie;
import com.test.movies.repository.MovieRepository;
import com.test.movies.service.MovieService;

public class MovieServiceImpl implements MovieService{

	@Autowired MovieRepository movieRepository;
	
	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> fetchMovieList() {
		return movieRepository.findAll();
	}

	@Override
	public Movie updateMovie(Movie movie, Long movieId) {
		Movie movieDb = movieRepository.getById(movieId);
		
		movieDb.setMovieName(movie.getMovieName());
		movieDb.setGenre(movie.getGenre());
		
		return movieRepository.save(movieDb);
	}

	@Override
	public void deleteMovieById(Long movieId) {
		movieRepository.deleteById(movieId);
	}

}
