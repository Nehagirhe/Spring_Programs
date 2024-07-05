package com.programming.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.programming.springboot.model.Employee;
import com.programming.springboot.model.EmployeeDao;

@SpringBootApplication
public class SpringbootApplication02Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication02Application.class, args);
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		EmployeeDao ed=(EmployeeDao)factory.getBean("ed");
		Employee e=new Employee("Nupur","Wipro","nup20@gmail.com");
		
		int a=ed.saveemp(e);
		if(a==1) {
			System.out.println("Data Inserted");
		}
		else
			System.out.println("Data Not Inserted");
		
	}

}
