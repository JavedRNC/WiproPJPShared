package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.MultiCarOwner;


public class OwnerDAO {
	SessionFactory sessionFactory;
	
	public OwnerDAO() {
		sessionFactory=new Configuration().configure().buildSessionFactory();
		
	}
   
	public String insertCarOwner(MultiCarOwner o) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.persist(o);
		tx.commit();
		return "success";
		
		
	}

}
