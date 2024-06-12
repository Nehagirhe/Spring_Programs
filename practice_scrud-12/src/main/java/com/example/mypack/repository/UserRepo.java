package com.example.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mypack.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
