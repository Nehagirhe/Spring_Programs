package com.programming.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String uname;
private String upass;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String uname, String upass) {
	super();
	this.id = id;
	this.uname = uname;
	this.upass = upass;
}
	
public User(String uname, String upass) {
	super();
	this.uname = uname;
	this.upass = upass;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
@Override
public String toString() {
	return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + "]";
}



}
