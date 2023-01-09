package com.saral.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employees {
	
	@Id
	private int empID;
	private String name;
	private String gender;
	private Date doj;
	private String emailID;
	private long mobileNumber;
	private String password;
	private int jobID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Managers manager;
	
	
	
	
	public Employees() {
		
	}

	public Employees(int empID, String name, String gender, Date doj, String emailID, long mobileNumber,
			String password, int jobID) {
		
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.doj = doj;
		this.emailID = emailID;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.jobID = jobID;
		
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public Employees(Managers manager) {
		super();
		this.manager = manager;
	}

	public Managers getManager() {
		return manager;
	}

	public void setManager(Managers manager) {
		this.manager = manager;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	

}
