package com.test.theater.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String addressId;
	
	private String plotNo;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private int pinCode;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theaterId", nullable = false)
    private TheaterEntity theater;
}
