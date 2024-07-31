package com.programming.springboot.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.programming.springboot.model.User;
import com.programming.springboot.repository.UserRepo;

@Controller
public class HomeController {

	@Autowired
	UserRepo db;
	
	@RequestMapping(path= "/")
	String MyFun(Model m) 
	{
		User u=new User();
		m.addAttribute("obj", u);
		System.out.println("Object : "+u);
		return "reg.html";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	String MyFun2(@ModelAttribute("obj") User u)
	{
		System.out.println("User Object : "+u);
		db.save(u);
		return "DATA INSERTED";	
	}
	

	@RequestMapping("/sh")
	String MyFun3(Model m)
	{
	List<User> l=db.findAll();
	 m.addAttribute("obj", l);
	System.out.println(l);
 	// db.findAll();
 	return "userTable.html";
	}
	
	@RequestMapping("/delete/{id}")
	String del(@PathVariable(name = "id") int id)
	{
	System.out.println("ID : "+id);
	db.deleteById(id);
	return "redirect:/sh";
	}
	
	@RequestMapping("/edit/{id}")
	String Edituser(@PathVariable(name = "id") int id,Model m) {
	System.out.println("Edit Id : "+id);
	User u=db.getOne(id);
	m.addAttribute("obj", u);
	return "form1.html";
	} 


	
	@RequestMapping("/j")
	@ResponseBody
	List<User> jso() {
	List <User>li=db.findAll();
	return li;
	}
	
}