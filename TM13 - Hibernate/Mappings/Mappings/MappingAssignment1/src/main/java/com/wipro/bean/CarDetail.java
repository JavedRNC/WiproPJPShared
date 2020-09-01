package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class CarDetail {
	

	@Column(name="regno")
	private String regNo;
	@Id
	private String model;
	private String color;
	private String manufacturer;
	
	
	public CarDetail(String regNo, String model, String color, String manufacturer) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "CarDetail [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer
				+ "]";
	}
	
	

}
