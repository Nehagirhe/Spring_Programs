package com.programming.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.programming.springboot.model.User;
import com.programming.springboot.repository.UserRepository;

@Controller
public class HomeController {
@Autowired
UserRepository repo;
	
	@RequestMapping("/")
	String MyFun(Model m)
	{
		User u=new User();
		m.addAttribute("obj",u);
		return "registration.html";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	String insert(@ModelAttribute("obj") User u)
	{
	repo.save(u);
	return "User Registered Successfully";
	}
	
}
