package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Modules;
@Repository
public interface ModulesRep extends CrudRepository<Modules, Integer> {

}
