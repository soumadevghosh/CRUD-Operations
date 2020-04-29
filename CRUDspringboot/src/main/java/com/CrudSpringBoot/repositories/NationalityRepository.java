package com.CrudSpringBoot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpringBoot.model.Nationality;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, Integer>
{
	
}
