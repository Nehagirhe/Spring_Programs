package com.programming.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
