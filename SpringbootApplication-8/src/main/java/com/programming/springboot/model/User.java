package com.programming.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1_tbl")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String fname, String lname, String email, String pass) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
	}
	public User(String fname, String lname, String email, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
	return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass + "]";
	}
	
}
