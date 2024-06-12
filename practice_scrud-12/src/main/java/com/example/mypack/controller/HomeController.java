package com.example.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mypack.model.User;
import com.example.mypack.repository.UserRepo;

@Controller
public class HomeController {
@Autowired
UserRepo ur;
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
	String read(Model m){
		List<User>ul=ur.findAll();
		m.addAttribute("userlist", ul);
		return"read";
	}
	
	@RequestMapping("/delete/{id}")
	String delete(@PathVariable(name="id") int id, Model m) {
		ur.deleteById(id);
		return "redirect:/read";
	}
	
	
	@RequestMapping("/edit/{id}")
	String edit(@PathVariable(name="id") int id,Model m) {
	   User u=ur.getOne(id);
		m.addAttribute("user" ,u);
		return "edit";
	}
	
	@RequestMapping("/edituser")
	String edituser(@ModelAttribute("user") User u1) {
		ur.save(u1);
		return "redirect:/read";
	}
}