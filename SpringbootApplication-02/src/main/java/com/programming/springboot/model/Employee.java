package com.programming.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String compname;
private String email;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, String compname, String email) {
	super();
	this.name = name;
	this.compname = compname;
	this.email = email;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompname() {
	return compname;
}
public void setCompname(String compname) {
	this.compname = compname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
