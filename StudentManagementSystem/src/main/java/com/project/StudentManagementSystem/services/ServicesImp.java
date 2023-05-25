package com.project.StudentManagementSystem.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.University;
import com.project.StudentManagementSystem.repository.CollegeRepository;
import com.project.StudentManagementSystem.repository.UniversityRepository;

@Service
public class ServicesImp implements Services{

	private UniversityRepository universityRepo;
	private CollegeRepository collegeRepo;
	
	public ServicesImp(UniversityRepository universityRepo, CollegeRepository collegeRepo) {
		super();
		this.universityRepo = universityRepo;
		this.collegeRepo = collegeRepo;
	}

	//University Abstract Method Implementation
	/**
	 * 
	 */
	@Override
	public University saveUniversityData(University university) {
		
		return universityRepo.save(university);
	}

	//College Abstract Method Implementation
	/**
	 * Saves the colleges in the college table into the database
	 */
	@Override
	public College saveCollegeData(College college) {
		
		return collegeRepo.save(college);
	}

	/**
	 * Delete college from database by ID
	 */
	@Override
	public String deleteCollegeById(Long id) {
		collegeRepo.deleteById(id);
		return "College data Deleted Sucessfully from the Database";
	}
	
	
}
