package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Project;
import com.saral.repositories.ProjectRep;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRep prjRep;

	@Override
	public void addProject(Project prj) {
		// TODO Auto-generated method stub
		prjRep.save(prj);

	}

}
