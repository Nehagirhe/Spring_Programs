package com.programming.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/test")
	@ResponseBody
	String myfun()
	{
		System.out.println("its a my fun method");
		return "hello world";
	}
	
	@RequestMapping("/")
	String myfun2()
	{
	   return "home.html";
	}
	
}