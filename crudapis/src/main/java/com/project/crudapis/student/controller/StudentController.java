package com.project.crudapis.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.crudapis.student.model.StudentModel;
import com.project.crudapis.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}


	//POST API (Create & Save)
	@PostMapping("/enterStudentData")
	public ResponseEntity<StudentModel> createSaveStudentData(@RequestBody StudentModel student) {
		return new ResponseEntity<StudentModel>(studentService.createSaveStudentData(student), HttpStatus.CREATED);
	}
	
	//GET API (Get all Student Info)
	@GetMapping("/getAllStudentInfo")
	public List<StudentModel> getAllStudentInfo(StudentModel student) {
		return studentService.getAllStudentInfo(student);
		
	}
	
	//GET API (Get all Student Info By Id)
	@GetMapping("/getStudentInfoById/{id}")
	public Optional<StudentModel> getStudentInfoById(StudentModel student, @PathVariable("id") Integer id) {
		return studentService.getStudentInfoById(student,id);
			
	}
	
	//PUT API (Update Student Info By Id)
	@PutMapping("/updateStudentInfoById/{id}")
	public ResponseEntity<StudentModel> updateStudentInfoById(@RequestBody StudentModel student, @PathVariable("id") Integer id) {
		
			return new ResponseEntity<StudentModel>(studentService.updateStudentInfoById(student, id), HttpStatus.ACCEPTED);
		
	}
	
	//PATCH API (Partial Update Student Info By Id)
	@PatchMapping("/partialUpdateStudentInfoById/{id}")
	public ResponseEntity<StudentModel> partialUpdateStudentInfoById(@RequestBody StudentModel student, @PathVariable("id") Integer id) {
		
			return new ResponseEntity<StudentModel>(studentService.partialUpdateStudentInfoById(student, id), HttpStatus.ACCEPTED);		
	}
	
	//DELETE API (Delete Student Info By Id)
	@DeleteMapping("/deletStudentInfoById/{id}")
	public String deleteStudentInfoById(@PathVariable("id") Integer id) {
		
		studentService.deleteStudentInfoById(id);
		return "Information Deleted Successfully";
	}
	
	//DELETE API (Delete All Student Info)
	@DeleteMapping("/deletAllStudentInfo/{id}")
	public String deleteAllStudentInfo(@PathVariable("id") Integer id) {
			
		studentService.deleteAllStudentInfo(id);
		return "All Students Information Deleted Successfully";
	}

}
