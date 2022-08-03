package com.test.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.show.entity.Show;


public interface ShowRepository extends JpaRepository<Show, Long>{

}
