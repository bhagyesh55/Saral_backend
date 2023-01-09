package com.saral.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Managers {
	
	@Id
	private int managerID;
	private String name;
	private int teamsID;
	private int empID;
	
	public Managers() {
	
	}
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Modules mods;

	public Managers(int managerID, String name, int teamsID, int empID) {
		
		this.managerID = managerID;
		this.name = name;
		this.teamsID = teamsID;
		this.empID = empID;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

//	public Managers(Modules mods) {
//		
//		this.mods = mods;
//	}
//
//	public Modules getMods() {
//		return mods;
//	}
//
//	public void setMods(Modules mods) {
//		this.mods = mods;
//	}

	public int getTeamsID() {
		return teamsID;
	}

	public void setTeamsID(int teamsID) {
		this.teamsID = teamsID;
	}
	
	

	

	
	
	
	
	
	

}
