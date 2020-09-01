package com.wipro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("beans.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    DefaultMessage dm=(DefaultMessage)factory.getBean("defaultbean");  
	    dm.display();  
	}

}
