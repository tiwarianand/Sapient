package com.test.theater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.theater.entity.TheaterEntity;


public interface TheaterRepository extends JpaRepository<TheaterEntity, Long> {

}

