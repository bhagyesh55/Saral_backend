package com.saral.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teams {
	
	@Id
	private int teamID;
	
	@ManyToOne
	private Project prj;

	public Teams() {
		super();
	}

	public Teams(int teamID, Project prj) {
		super();
		this.teamID = teamID;
		this.prj = prj;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

	public Project getPrj() {
		return prj;
	}

	public void setPrj(Project prj) {
		this.prj = prj;
	}
	
	

}
