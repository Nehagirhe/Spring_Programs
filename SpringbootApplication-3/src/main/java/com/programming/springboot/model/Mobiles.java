package com.programming.springboot.model;

public class Mobiles {

	private int id;
	private String mobname;
	private String price;
	
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobiles(String mobname, String price) {
		super();
		this.mobname = mobname;
		this.price = price;
	}

	public Mobiles(int id, String mobname, String price) {
		super();
		this.id = id;
		this.mobname = mobname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobname() {
		return mobname;
	}

	public void setMobname(String mobname) {
		this.mobname = mobname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
