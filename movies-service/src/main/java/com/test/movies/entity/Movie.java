package com.test.movies.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID movieId;
	
	private String movieName;
	
	private String genre;
}

