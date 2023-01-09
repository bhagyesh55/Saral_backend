package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Jobs;

@Repository
public interface JobsRep extends CrudRepository<Jobs,Integer> {

}
