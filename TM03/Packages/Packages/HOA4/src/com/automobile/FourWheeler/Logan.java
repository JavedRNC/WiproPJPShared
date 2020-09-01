package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
	int speed;
	public Logan(String modelName,String registrationNumber, String ownerName,int Speed)
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
	
	public int gps()
	{
		System.out.println("gps function is called, Provides facility to control the gps device");
		return 0; }
	}


