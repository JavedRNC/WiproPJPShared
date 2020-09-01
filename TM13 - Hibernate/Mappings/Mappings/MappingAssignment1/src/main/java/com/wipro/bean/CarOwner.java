package com.wipro.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CarOwner")
public class CarOwner {
	@Id
	private int ownerid;
	@Column(length=20,nullable=false)
	private String ownerName;
	@OneToOne(cascade=CascadeType.PERSIST)
	private CarDetail car;
	
	
	public CarOwner(int ownerid, String ownerName, CarDetail car) {
		super();
		this.ownerid = ownerid;
		this.ownerName = ownerName;
		this.car = car;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public CarDetail getCar() {
		return car;
	}
	public void setCar(CarDetail car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "CarOwner [ownerid=" + ownerid + ", ownerName=" + ownerName + ", car=" + car + "]";
	}
	
	

}
