package com.project.StudentManagementSystem.services;

import java.util.Optional;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.Student;
import com.project.StudentManagementSystem.entity.University;

public interface Services {

	/*
	 * University Abstract Methods
	 */
	University saveUniversityData(University university);
	Optional<University> getUniversityById(Long id);

	/*
	 * College Abstract Methods
	 */
	College saveCollegeData(College college);
	String deleteCollegeById(Long id);
	String saveCollegeDataByUniversity(College college , String  name);
	Optional<College> getCollegeById(Long id);

	
	/*
	 * Student Abstract Methods
	 */
	String saveStudentData(Student student, String college);
	Optional<Student> getStudentInfoById(Long id);

	
	

}
