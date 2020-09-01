package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
	int speed;
	public Ford(String modelName,String registrationNumber, String ownerName,int Speed)
	{
		this.ModelName = modelName;
		this.RegistrationNumber = registrationNumber;
		this.OwnerName = ownerName; 
		this.speed = Speed;
	}
	
	public String getModelName()
	{
		return ModelName;
	}
	public String getRegistrationNumber()
	{
		return RegistrationNumber;
	}
	
	public String getOwnerName()
	{
		return OwnerName;
	}
	
	
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int tempControl()
	{
		System.out.println("tempControl function is called, provides facility to control the air conditioning device which is available in the car");
		return 0;}
	}


