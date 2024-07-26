package com.programming.springboot.model;

public class User {
private String name;
private int age;
private double salary;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}



}
