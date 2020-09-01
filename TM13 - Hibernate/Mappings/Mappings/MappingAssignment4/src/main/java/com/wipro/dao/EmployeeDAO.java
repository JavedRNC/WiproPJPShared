package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;



public class EmployeeDAO {

	SessionFactory sessionFactory;
	
	public EmployeeDAO() {
		sessionFactory=new Configuration().configure().buildSessionFactory();
		
	}
   
	public String insertEmployee(Employee e) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//session.persist(e.getPassport());
		session.persist(e);
		tx.commit();
		return "Inserted Successfully";
				
	}
	
	public String deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//Employee emp=new Employee();
		//emp.setEmpId(id);
		Employee e=session.get(Employee.class, id);
		//Passport  p=e.getPassport();
		session.delete(e);
		//session.delete(p);
		e.setPassport(null);;
		
		tx.commit();
		return "Deleted Successfully";
				
	}

}
