package com.wipro.service;


import java.util.ArrayList;
import java.util.Arrays;

import com.wipro.bean.CarDetail;

import com.wipro.bean.MultiCarOwner;
import com.wipro.dao.OwnerDAO;


public class CarService {

	public static void main(String[] args) {
		CarDetail c1=new CarDetail("TS-76","RJ 230 Polo","Silver","Toyota");
		CarDetail c2=new CarDetail("RJ-62","PN 200 Corolla","Black","Toyota");
		MultiCarOwner o=new MultiCarOwner(1003,"Mohit",new ArrayList<CarDetail>(Arrays.asList(c1,c2)));
		OwnerDAO dao=new OwnerDAO();
		System.out.println("Result : "+dao.insertCarOwner(o));
	}

}
