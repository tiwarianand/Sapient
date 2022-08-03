package com.test.show.entity;

import java.sql.Timestamp;

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
@Table(name = "show")
public class Show {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showId;
	
	private Long theaterId;
	
	private Long movieId;
	
	private Timestamp showTime;
}
