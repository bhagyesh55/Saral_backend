package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Managers;

@Repository
public interface ManagerRep extends CrudRepository<Managers,Integer> {

}
