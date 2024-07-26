package com.programming.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programming.springboot.model.User;

@Controller
public class HomeController {

	@RequestMapping("/test")
	String MyFun(Model m) {
		String name= "Vaidehi";
		int age=22;
		int salary=25000;
		m.addAttribute("uname", name);
		m.addAttribute("uage", age);
		m.addAttribute("usalary", salary);	
		return "page1.html";	
	}
	
	@RequestMapping("/")
	String MyFun2(Model m)
	{
		int age=10;
		String name="Neha";
		double salary=3098.78;
		m.addAttribute("age", age);
		m.addAttribute("name", name);
		m.addAttribute("salary", salary);
		return "page2.html";
	}
	@RequestMapping("/test3")
	String MyFun3(Model m) {
		User u=new User("Mayuri",32,34000);
		m.addAttribute("obj", u);
		return "page3.html";
	}
}
