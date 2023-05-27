package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.StudentManagementSystem.entity.University;

public interface UniversityRepository extends JpaRepository<University, Long>{

	@Query("select u from University u where u.name = :name")
	University findByName(@Param("name") String name);

}
