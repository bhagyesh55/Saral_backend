package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Teams;

@Repository
public interface TeamRep extends CrudRepository<Teams, Integer> {

}
