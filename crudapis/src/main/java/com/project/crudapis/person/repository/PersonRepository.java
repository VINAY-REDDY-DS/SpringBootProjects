package com.project.crudapis.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.crudapis.person.model.PersonModel;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Integer>{
	//PLQL Query
	@Query("select p from person p where p.name = ?1")
	public List<PersonModel> findByName(String name);
	
	@Query(value = "select * from person_info p where p.Address = ?1", nativeQuery = true)
	public List<PersonModel> findByAddress(String Address);
		

}
