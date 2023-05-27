package com.project.StudentManagementSystem.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.Student;
import com.project.StudentManagementSystem.entity.University;
import com.project.StudentManagementSystem.repository.CollegeRepository;
import com.project.StudentManagementSystem.repository.StudentRepository;
import com.project.StudentManagementSystem.repository.UniversityRepository;

@Service
public class ServicesImp implements Services{

	private UniversityRepository universityRepo;
	private CollegeRepository collegeRepo;
	private StudentRepository studentRepo;
	
	public ServicesImp(UniversityRepository universityRepo, CollegeRepository collegeRepo, StudentRepository studentRepo ) {
		super();
		this.universityRepo = universityRepo;
		this.collegeRepo = collegeRepo;
		this.studentRepo = studentRepo;
	}

	//University Abstract Method Implementation
	/**
	 * saves the university information into the database
	 */
	@Override
	public University saveUniversityData(University university) {
		
		return universityRepo.save(university);
	}
	
	/**
	 * 
	 */
	@Override
	public Optional<University> getUniversityById(Long id) {
		
		return universityRepo.findById(id);
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

	/**
	 * In this method , first the university is validated before saving the college data , 
	 * if college is present in the database then ,
	 * set the university to the in coming college and save the college information in the database.
	 */
	@Override
	public String saveCollegeDataByUniversity(College college, String name) {
		University existingUniversity = universityRepo.findByName(name);
		if((existingUniversity.getName()).equals(name)) 
			college.setUniversity(existingUniversity);
			collegeRepo.save(college);
		
			return "College saved Sucessfully";
	}

	/**
	 * Method invokes the findById method in college repository
	 * and returns the id related information back to caller.
	 */
	@Override
	public Optional<College> getCollegeById(Long id) {
		
		return collegeRepo.findById(id);
	}

	/*
	 * Student Abstract Method Implementation
	 */
	/**
	 * 
	 */
	@Override
	public String saveStudentData(Student student, String college) {
		College existingCollege = collegeRepo.findByName(college);
		if((existingCollege.getName()).equals(college)) {
				student.setCollege(existingCollege);
		studentRepo.save(student);
		}		
		return "Student Info Saved Sucessfully";
	}

	/**
	 * 
	 */
	@Override
	public Optional<Student> getStudentInfoById(Long id) {
		
		return studentRepo.findById(id);
	}

	
	
	
	
	
	
}
