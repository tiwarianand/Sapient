package com.test.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
