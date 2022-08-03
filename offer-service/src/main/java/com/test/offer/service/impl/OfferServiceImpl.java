package com.test.offer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.offer.entity.Offer;
import com.test.offer.repository.OfferRepository;
import com.test.offer.service.OfferService;

public class OfferServiceImpl implements OfferService{
	
	@Autowired
	private OfferRepository offerRepository;

	@Override
	public Offer saveOffer(Offer offer) {
		return offerRepository.save(offer);
	}

	@Override
	public List<Offer> fetchOfferList() {
		return (List<Offer>)offerRepository.findAll();
	}

	@Override
	public Offer updateOffer(Offer offer, Long offerId) {
		Offer offerDb = offerRepository.getById(offerId);
		offerDb.setOfferPercentage(offer.getOfferPercentage());
		offerDb.setOfferCriteria(offer.getOfferCriteria());
		return offerRepository.save(offerDb);
	}

	@Override
	public void deleteOfferById(Long offerId) {
		offerRepository.deleteById(offerId);
	}

}
