package com.CrudSpringBoot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpringBoot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
