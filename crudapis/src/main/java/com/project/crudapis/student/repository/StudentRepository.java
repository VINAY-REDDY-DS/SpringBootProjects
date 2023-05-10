package com.project.crudapis.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.crudapis.student.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel , Integer>{

}
