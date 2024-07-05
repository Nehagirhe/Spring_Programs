package com.programming.springboot.model;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {

	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	public int saveemp(Employee e)
	{
		int a=0;
		temp.save(e);
		a=1;
		return a;
	}
	
	public int update(Employee e)
	{
		int a=0;
		temp.update(e);
		a=1;
		return a;
	}
	
	
}
