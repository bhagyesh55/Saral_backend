package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Managers;
import com.saral.service.ManagerService;

@RestController
public class ManagerController {
	
	@Autowired
	private ManagerService mgrService;
	
	@PostMapping("/mgr/add")
	public ResponseEntity<String> addManager(@RequestBody Managers mgr){
		mgrService.addManager(mgr);
		
		return new ResponseEntity<String> ("New Manager is added", HttpStatus.OK);
	}

}
