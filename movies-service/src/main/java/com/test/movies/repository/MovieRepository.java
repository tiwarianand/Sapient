package com.test.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.movies.entity.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long>{

}
