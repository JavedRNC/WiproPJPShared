package com.wipro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Movie movie1 = (Movie) beanFactory.getBean("movieIdBean");
		movie1.display1();
		
		Movie movie2 = (Movie) beanFactory.getBean("movieNameBean");
		movie2.display2();
		
		Movie movie3 = (Movie) beanFactory.getBean("movieActorBean");
		movie3.display3();
	}
}
