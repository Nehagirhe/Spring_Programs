import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Employee;
import model.Teacher;

public class Test {

	public static void main(String[] args) {
		/*Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Teacher t=(Teacher)factory.getBean("t",Teacher.class);  
	   t.toString();*/
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher t1=context.getBean("t1",Teacher.class);
		System.out.println(t1);
		Employee e1=(Employee) context.getBean("e1",Employee.class);
		System.out.println(e1);
		
		
		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=context.getBean("e1",Employee.class);
		System.out.println(e1);*/
		
	}

}
