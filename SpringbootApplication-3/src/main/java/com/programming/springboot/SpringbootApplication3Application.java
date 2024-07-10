package com.programming.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import com.programming.springboot.model.MobileDao;
import com.programming.springboot.model.Mobiles;

@SpringBootApplication
public class SpringbootApplication3Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication3Application.class, args);
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		MobileDao md=(MobileDao) factory.getBean("md");	
		Mobiles m=new Mobiles("Redmi","13000");
		
		
		
				
	}

}
