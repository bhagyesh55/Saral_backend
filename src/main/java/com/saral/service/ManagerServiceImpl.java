package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Managers;
import com.saral.repositories.ManagerRep;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private ManagerRep managerRep;

	@Override
	public void addManager(Managers mgr) {
		// TODO Auto-generated method stub
		managerRep.save(mgr);
	}

}
