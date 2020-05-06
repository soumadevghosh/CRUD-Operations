package com.CrudSpringBoot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpringBoot.model.Nationality;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, Integer>
{
//	List<Nationality> findByName(String name);			//custom method should follow the syntax "findBy'columnname'"
//	
//	List<Nationality> findByIdGreaterThan(Integer id); //customized method to fetch Id greater than the input
//	
//	@Query("from Nationality where country=?1 order by name")		//use of JPQL for complex queries
//	List<Nationality> findByCountrySorted(String country);  
}
