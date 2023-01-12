package com.saral.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saral.entities.Teams;
import com.saral.service.TeamsService;

@RestController
public class TeamsController {
	
	@Autowired
	private TeamsService teamservice;
	
	@PostMapping("/team/add")
	public ResponseEntity<String> addTeam(@RequestBody Teams team){
		teamservice.addTeam(team);
		return new ResponseEntity<String> ("New Team is added",HttpStatus.OK);
	}
}
