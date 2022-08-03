package com.test.offer.service;

import java.util.List;

import com.test.offer.entity.Offer;


public interface OfferService {

	// Save operation
	Offer saveOffer(Offer offer);
  
    // Read operation
    List<Offer> fetchOfferList();
  
    // Update operation
    Offer updateOffer(Offer offer,Long offerId);
  
    // Delete operation
    void deleteOfferById(Long offerId);
}
