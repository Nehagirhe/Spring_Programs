package com.programming.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.programming.springboot.model.User;
import com.programming.springboot.repository.UserDetailsImplements;
import com.programming.springboot.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired 
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUname(username);	
		
		if(user==null) 
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new UserDetailsImplements(user);
		
	}

	
}
