package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Employees;
import com.saral.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/emp/add")
	public ResponseEntity<String> addEmp(@RequestBody Employees emp){
		empService.addEmp(emp);
		return new ResponseEntity<String> ("New Employees is added", HttpStatus.OK);
	}
	
	
	

}
