package com.test.offer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.offer.entity.Offer;
import com.test.offer.service.OfferService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class OfferController {

	@Autowired private OfferService offerService;
	
	// Save operation
    @PostMapping("/addOffer")
    public Offer saveOffer(@Valid @RequestBody Offer offer)
    {
        return offerService.saveOffer(offer);
    }
    
    // Get operation
    @GetMapping("/offers")
    public List<Offer> fetchOfferList()
    {
        return offerService.fetchOfferList();
    }
    
    // Update operation
    @PutMapping("/offers/{id}")
    public Offer updateOffer(@RequestBody Offer offer, @PathVariable("id") Long offerId)
    {
        return offerService.updateOffer(offer, offerId);
    }
  
    // Delete operation
    @DeleteMapping("/offers/{id}")
    public String deleteOfferById(@PathVariable("id") Long offerId)
    {
    		offerService.deleteOfferById(offerId);
  
        return "Deleted Successfully";
    }
}
