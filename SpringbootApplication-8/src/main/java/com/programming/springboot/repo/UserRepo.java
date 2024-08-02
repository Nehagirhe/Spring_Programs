package com.programming.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.springboot.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	

}
