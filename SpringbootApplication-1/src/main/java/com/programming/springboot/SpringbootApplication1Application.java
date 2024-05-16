package com.programming.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.programming.springboot.model.Teacher;
import com.programming.springboot.model.TeacherDao;

@SpringBootApplication
public class SpringbootApplication1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication1Application.class, args);
		

		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
	    
	      TeacherDao db=(TeacherDao)factory.getBean("db");	      
	      Teacher s=new Teacher("Neha", "Pune");
	      
	     int a= db.saveStud(s);
	     if(a==1)
	     {
	    	 System.out.println("Data Inserted");
	     }
	     else
	    	 System.out.println("Data Not Inserted");		
	}
	}


