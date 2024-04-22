import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Student;

public class test {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student s=(Student)factory.getBean("s");  
		System.out.println(s);
		   s.toString();
		
	}

}
