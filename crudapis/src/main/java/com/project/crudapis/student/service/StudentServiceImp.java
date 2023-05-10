package com.project.crudapis.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudapis.student.model.StudentModel;
import com.project.crudapis.student.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;
	
	public StudentServiceImp(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public StudentModel createSaveStudentData(StudentModel student) {
		
		return studentRepo.save(student);
	}

	@Override
	public List<StudentModel> getAllStudentInfo(StudentModel student) {
		
		return studentRepo.findAll();
	}

	@Override
	public Optional<StudentModel> getStudentInfoById(StudentModel student, Integer id) {
		
		return studentRepo.findById(id);
	}

	@Override
	public StudentModel updateStudentInfoById(StudentModel student, Integer id) {
		StudentModel existingStudent = studentRepo.findById(id).orElse(student);
		
		if(existingStudent != null) {
			
			existingStudent.setName(student.getName());
			existingStudent.setEmail(student.getEmail());
			existingStudent.setPhone(student.getPhone());
			existingStudent.setAddress(student.getAddress());
			existingStudent.setPincode(student.getPincode());
			return studentRepo.save(existingStudent);
		}
		else
			return studentRepo.save(student);
	}

	@Override
	public StudentModel partialUpdateStudentInfoById(StudentModel student, Integer id) {
		StudentModel existingStudent = studentRepo.findById(id).orElse(student);
		
		if(existingStudent != null) {
			existingStudent.setEmail(student.getEmail());
			existingStudent.setAddress(student.getAddress());
			existingStudent.setPincode(student.getPincode());
		}
		return studentRepo.save(existingStudent);
	}

	@Override
	public void deleteStudentInfoById(Integer id) {
		studentRepo.deleteById(id);
	}

	@Override
	public void deleteAllStudentInfo(Integer id) {
		studentRepo.deleteAll();
	}

}
