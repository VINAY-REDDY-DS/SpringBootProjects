package com.project.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.University;
import com.project.StudentManagementSystem.services.Services;

@RestController
@RequestMapping("/api/studentmanagement/maingateway")
public class Controller {
	
	@Autowired
	private Services services;
	
	
	//University Model End Points
	/**
	 * 
	 * @param university
	 * @return
	 */
	@PostMapping("/postUniversities")
	public ResponseEntity<University> saveUniversityData(@RequestBody University university) {
		return new ResponseEntity<University>(services.saveUniversityData(university), HttpStatus.ACCEPTED);
	}
	
	
	 //College Model End Points
	/**
	 * 
	 * @param college
	 * @return
	 */
	@PostMapping("/postColleges")
	public ResponseEntity<College> saveCollegeData(@RequestBody College college) {
		return new ResponseEntity<College>(services.saveCollegeData(college), HttpStatus.ACCEPTED);
	}
	
	/**
	 * 
	 * @param id
	 * @return "message" - data has been deleted Successfully from the database. 
	 */
	@DeleteMapping("/deleteCollegeById/{id}")
	public String deleteCollegeById(@PathVariable Long id) {
		return services.deleteCollegeById(id);
		
	}

}
