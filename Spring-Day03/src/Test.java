import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.A;

public class Test {

	public static void main(String[] args) {
		Resource r =new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(r);
		
		A a=(A) bean.getBean("proxy");	
		a.age(12);
	}

}
