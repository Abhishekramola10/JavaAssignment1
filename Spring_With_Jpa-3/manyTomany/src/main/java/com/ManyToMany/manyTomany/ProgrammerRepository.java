package com.ManyToMany.manyTomany;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {
}
