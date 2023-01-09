package com.saral.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Jobs {
	
	@Id
	private int jobID;
	private String description;
	private String qualification;
	private int experience;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Project prj;
	
	public Jobs() {
		
	}

	public Jobs(int jobID, String description, String qualification, int experience) {
		super();
		this.jobID = jobID;
		this.description = description;
		this.qualification = qualification;
		this.experience = experience;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Jobs(Project prj) {
		super();
		this.prj = prj;
	}

	public Project getPrj() {
		return prj;
	}

	public void setPrj(Project prj) {
		this.prj = prj;
	}
	
	
	

}
