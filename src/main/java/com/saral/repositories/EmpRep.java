package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Employees;

@Repository
public interface EmpRep extends CrudRepository<Employees, Integer>{

}
