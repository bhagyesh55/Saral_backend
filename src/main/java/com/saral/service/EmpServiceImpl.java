package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Employees;
import com.saral.repositories.EmpRep;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRep empRes;

	@Override
	public void addEmp(Employees emp) {
		// TODO Auto-generated method stub
		empRes.save(emp);

	}

}
