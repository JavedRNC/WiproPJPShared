package com.wipro.service;


import com.wipro.bean.CarDetail;
import com.wipro.bean.CarOwner;
import com.wipro.dao.OwnerDAO;


public class CarService {

	public static void main(String[] args) {
		CarDetail c=new CarDetail("KL-89","AK 120 Polo","Black","Volkswagen");
		CarOwner o=new CarOwner(1002,"Rohit",c);
		OwnerDAO dao=new OwnerDAO();
		System.out.println("Result : "+dao.insertCarOwner(o));
	}

}
