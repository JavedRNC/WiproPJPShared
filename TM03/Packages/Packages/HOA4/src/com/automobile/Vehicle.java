package com.automobile;
public abstract class Vehicle
{
	public String ModelName;
	public String RegistrationNumber;
	public String OwnerName;
	
	abstract public String getModelName();
	abstract public String getRegistrationNumber();
	abstract public String getOwnerName();
}