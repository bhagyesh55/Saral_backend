package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Modules;
import com.saral.service.ModulesService;

@RestController
public class ModulesController {
	
	@Autowired
	private ModulesService modservice;
	
	@PostMapping("/mod/add")
	public ResponseEntity<String> addModule(@RequestBody Modules mod){
		modservice.addModule(mod);
		return new ResponseEntity<String>("New Module Added", HttpStatus.OK);
	}

}
