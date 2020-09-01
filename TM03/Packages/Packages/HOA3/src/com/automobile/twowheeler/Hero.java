package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle
{	int speed;
	public Hero(String modelName,String registrationNumber, String ownerName,int Speed)
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
	
	public void radio()
	{
		System.out.println("Radio facility available");
	}
}