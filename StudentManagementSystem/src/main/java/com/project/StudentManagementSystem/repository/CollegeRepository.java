package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.StudentManagementSystem.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long>{

	@Query("select c from College c where c.name = :name")
	College findByName(@Param("name") String college);

}
