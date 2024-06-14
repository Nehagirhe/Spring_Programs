package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Controller
public class HomeController {

	@Autowired
	UserRepo ur;
	
/*	@RequestMapping("/")
	String Home() {
		return "index.html";
	}


	@RequestMapping("/create")
	String create(Model m) {
	m.addAttribute("EmptyUser", new User());
	return "create";
	}
	

	@RequestMapping(("/insert"))
	String insert(@ModelAttribute("EmptyUser") User u) 
	{
	ur.save(u);
	return "index.html";	
	}*/
	
	@RequestMapping("/")
	String home() {
	return "index.html";
	}
	
	@RequestMapping("/create")
	String create(Model m) {
	m.addAttribute("EmptyUser", new User());
	return "create";
	}
	
	@RequestMapping("/insert")
	String insert(@ModelAttribute("EmptyUser") User u) {
	ur.save(u);
	return "index.html";	
	}
	
	@RequestMapping("/read")
	String read(Model m) {
	List<User>ul=ur.findAll();
		m.addAttribute("userlist" ,ul);
		return "read";
	}
	
	@RequestMapping("/delete/{id}")
    String delete1(@PathVariable(name="id") int id, Model m) {
	ur.deleteById(id);
	return "redirect:/read";
    }
	
	/*@RequestMapping(value="/editshow/{id}")
	String editShow(@PathVariable(name="id") int id,Model m) {
	User u=ur.getOne(id);
	m.addAttribute("user",u);
	return "editshow";
	}
	
	@RequestMapping(value="/edit")
	String edit(@ModelAttribute("u")User u) {
	ur.save(u);
	return "redirect:/read";		
	}
	*/
	
	@RequestMapping("/editshow/{id}")
	String editshow(@PathVariable(name="id") int id,Model m) {
		User u=ur.getOne(id);
		m.addAttribute("user",u);
		return "editshow";
	}
	
	@RequestMapping("/edit")
	String edit(@ModelAttribute("u") User u) {
		ur.save(u);
		return "redirect:/read";
	}
	
}
