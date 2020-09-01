package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Address;
import com.wipro.bean.Employee;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Address address = new Address("OMR Road", "Chennai", "TN", "600097");
		Employee emp=new Employee(1002,"Rohit",900000,address);
		session.persist(emp);
		tx.commit();
		session.close();
		System.out.println("Success");
		
	}

}
