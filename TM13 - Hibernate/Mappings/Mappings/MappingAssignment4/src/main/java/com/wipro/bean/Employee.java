package com.wipro.bean;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Pass")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private int salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Passport passport;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, int salary, Passport passport) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.passport = passport;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", passport=" + passport
				+ "]";
	}
	
	
	
}
