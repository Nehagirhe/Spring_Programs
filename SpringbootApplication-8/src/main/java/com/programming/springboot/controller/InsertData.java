package com.programming.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.programming.springboot.model.User;
import com.programming.springboot.repo.UserRepo;

@Controller
public class InsertData {

	@Autowired
	UserRepo db;
	
	@RequestMapping(path= "/")
	@ResponseBody
	String MyFun(Model m) {
		User u=new User();
		m.addAttribute("obj", u);
		System.out.println(u);
		return "reg.html";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	String AddUser(@ModelAttribute("obj") User u) {
		System.out.println(u);
	    db.save(u);
		return "Data Inserted";
	}
}
