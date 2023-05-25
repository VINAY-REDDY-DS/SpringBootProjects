package com.project.StudentManagementSystem.services;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.University;

public interface Services {

	/*
	 * University Abstract Methods
	 */
	University saveUniversityData(University university);

	/*
	 * College Abstract Methods
	 */
	College saveCollegeData(College college);
	String deleteCollegeById(Long id);
	

}
