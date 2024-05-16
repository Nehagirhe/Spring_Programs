package com.programming.springboot.model;

import org.springframework.orm.hibernate3.HibernateTemplate;


import com.programming.springboot.model.Teacher;

public class TeacherDao {
	
	private HibernateTemplate temp;


	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	public int saveStud(Teacher s)
	{
		int a=0;
		temp.save(s);
		a=1;
		return a;
	}
	
	
	public int updateStud(Teacher s)
	{
		int a=0;
		temp.update(s);
		a=1;
		return a;
	}

}
