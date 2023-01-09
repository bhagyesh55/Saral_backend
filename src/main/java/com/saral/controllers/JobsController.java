package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Jobs;
import com.saral.service.JobsService;

@RestController
public class JobsController {
	
	@Autowired
	private JobsService jobservice;
	
	@PostMapping("/job/add")
	public ResponseEntity<String> addJob(@RequestBody Jobs job){
		jobservice.addJob(job);
		return new ResponseEntity<String> ("New Job is added", HttpStatus.OK);
		
	}

}
