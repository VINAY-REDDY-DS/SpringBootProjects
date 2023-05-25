package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StudentManagementSystem.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long>{

}
