package com.saral.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Modules {
	
	@Id
	private int moduleID;
	private String moduleName;
	
	@ManyToOne
	private Project projects;
	
	@OneToOne
	private Managers managers;

	public Modules() {
		super();
	}

	public Modules(int moduleID, String moduleName, Project projects, Managers managers) {
		super();
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.projects = projects;
		this.managers = managers;
	}

	public int getModuleID() {
		return moduleID;
	}

	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public Managers getManagers() {
		return managers;
	}

	public void setManagers(Managers managers) {
		this.managers = managers;
	}
	
	

}
