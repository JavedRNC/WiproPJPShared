package com.wipro.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MultiCarOwner")
public class MultiCarOwner {
	@Id
	private int ownerId;
	@Column(length=20,nullable=false)
	private String ownername;
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<CarDetail> cars;
	
	
	public MultiCarOwner(int ownerId, String ownername, List<CarDetail> cars) {
		super();
		this.ownerId = ownerId;
		this.ownername = ownername;
		this.cars = cars;
	}
	
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public List<CarDetail> getCars() {
		return cars;
	}
	public void setCars(List<CarDetail> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "MultiCarOwner [ownerId=" + ownerId + ", ownername=" + ownername + ", cars=" + cars + "]";
	}
	
	
	
	

}
