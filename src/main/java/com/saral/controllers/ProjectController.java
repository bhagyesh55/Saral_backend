package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Project;
import com.saral.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService prjservice;
	
	@PostMapping("/prj/add")
	public ResponseEntity<String> addProject(@RequestBody Project prj){
		prjservice.addProject(prj);
		return new ResponseEntity<String> ("New Project is added", HttpStatus.OK);
	}

}
