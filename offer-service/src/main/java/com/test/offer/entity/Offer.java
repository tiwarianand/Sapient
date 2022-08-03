package com.test.offer.entity;

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
@Table(name = "offer")
public class Offer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
	
	private int offerPercentage;
	
	private String offerCriteria;
}
