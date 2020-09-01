package com.wipro.service;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;
import com.wipro.dao.EmployeeDAO;

public class Main {

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		
		//Inserting records
		/*
		Passport p=new Passport('P',"P915688","ABC","IND");
		Employee emp=new Employee(1002,"ABC",900000,p);
		
		System.out.println("Result : "+dao.insertEmployee(emp));

		*/
		
		//Deleting records
		System.out.println("Result : "+dao.deleteEmployee(1002));
		
	}

}
