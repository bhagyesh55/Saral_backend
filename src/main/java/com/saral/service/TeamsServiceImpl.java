package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Teams;
import com.saral.repositories.TeamRep;

@Service
public class TeamsServiceImpl implements TeamsService {
	
	@Autowired
	private TeamRep teamrep;

	@Override
	public void addTeam(Teams team) {
		// TODO Auto-generated method stub
		teamrep.save(team);

	}

}
