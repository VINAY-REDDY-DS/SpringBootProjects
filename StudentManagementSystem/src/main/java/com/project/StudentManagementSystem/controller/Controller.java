package com.project.StudentManagementSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudentManagementSystem.entity.College;
import com.project.StudentManagementSystem.entity.Student;
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
	@PostMapping("/University/postUniversities")
	public ResponseEntity<University> saveUniversityData(@RequestBody University university) {
		return new ResponseEntity<University>(services.saveUniversityData(university), HttpStatus.ACCEPTED);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/University/getUniversityById/{id}")
	public ResponseEntity<Optional<University>> getUniversityById(@PathVariable Long id) {
		return new ResponseEntity<Optional<University>>(services.getUniversityById(id), HttpStatus.FOUND);
		
	}
	
	
	 //College Model End Points
	/**
	 * @param college
	 * @return the Response entity as body and the HTTP status as accepted.
	 */
	@PostMapping("/College/postColleges")
	public ResponseEntity<College> saveCollegeData(@RequestBody College college) {
		return new ResponseEntity<College>(services.saveCollegeData(college), HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/College/postCollegesByUniversity/{university}")
	public String saveCollegeDataByUniversity(@RequestBody College college , @PathVariable String university) {
		return services.saveCollegeDataByUniversity(college , university);
	}
	
	/**
	 * 
	 * @param id
	 * @return "message" - data has been deleted Successfully from the database. 
	 */
	@DeleteMapping("/College/deleteCollegeById/{id}")
	public String deleteCollegeById(@PathVariable Long id) {
		return services.deleteCollegeById(id);
		
	}
	
	/**
	 * 
	 * @param id
	 * @return the college details of the provided id
	 */
	@GetMapping("/College/getCollegeById/{id}")
	public Optional<College> getCollegeById(@PathVariable Long id) {
		return services.getCollegeById(id);	
	}
	
	
	//Student Model End Points
	/**
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping("/Student/saveStudentData/{college}")
	public ResponseEntity<String> saveStudentData(@RequestBody Student student, @PathVariable String college) {
		return new ResponseEntity<String>(services.saveStudentData(student, college), HttpStatus.ACCEPTED);
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/Student/getStudentInfoById/{id}")
	public ResponseEntity<Optional<Student>> getStudentInfoById(@PathVariable Long id) {
		return new ResponseEntity<Optional<Student>>(services.getStudentInfoById(id), HttpStatus.FOUND);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
