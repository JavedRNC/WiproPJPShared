package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {
	
	private char type;
	@Id
	@Column(name="passno")
	private String pNumber;
	private String name;
	private String countryCode;
	
	public Passport() {
		
	}
	
	public Passport(char type, String pNumber, String name, String countryCode) {
		super();
		this.type = type;
		this.pNumber = pNumber;
		this.name = name;
		this.countryCode = countryCode;
	}
	
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Passport [type=" + type + ", pNumber=" + pNumber + ", name=" + name + ", countryCode=" + countryCode
				+ "]";
	}
	
	

}
