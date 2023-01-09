package com.saral.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saral.entities.Project;

@Repository
public interface ProjectRep extends CrudRepository<Project, Integer> {

}
