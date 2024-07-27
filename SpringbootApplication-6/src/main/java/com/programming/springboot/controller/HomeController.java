package com.programming.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
 
	@RequestMapping("/")
	String MyFun(Model m)
	{
		String name="Neha";
		m.addAttribute("uname", name);
		return "page.html";
	}
	
	@RequestMapping("/test")
	ModelAndView MyFun2()
	{
		ModelAndView mv=new ModelAndView("page1.html");
		mv.addObject("uname", "Nikita");
		return mv;
	}
}
