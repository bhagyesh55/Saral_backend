package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Modules;
import com.saral.repositories.ModulesRep;

@Service
public class ModulesServiceImpl implements ModulesService {
	
	@Autowired
	private ModulesRep modrep;

	@Override
	public void addModule(Modules mod) {
		// TODO Auto-generated method stub
		modrep.save(mod);

	}

}
