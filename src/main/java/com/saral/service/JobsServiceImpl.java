package com.saral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saral.entities.Jobs;
import com.saral.repositories.JobsRep;

@Service
public class JobsServiceImpl implements JobsService {
	
	@Autowired
	private JobsRep jobrep;

	@Override
	public void addJob(Jobs job) {
		// TODO Auto-generated method stub
		jobrep.save(job);

	}

}
