package com.test.offer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.offer.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{

}
