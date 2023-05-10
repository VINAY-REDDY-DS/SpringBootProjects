package com.project.crudapis.student.service;

import java.util.List;
import java.util.Optional;

import com.project.crudapis.student.model.StudentModel;

public interface StudentService {
	
	StudentModel createSaveStudentData(StudentModel student);
	List<StudentModel> getAllStudentInfo(StudentModel student);
	Optional<StudentModel> getStudentInfoById(StudentModel student, Integer id);
	StudentModel updateStudentInfoById(StudentModel student, Integer id);
	StudentModel partialUpdateStudentInfoById(StudentModel student, Integer id);
	void deleteStudentInfoById(Integer id);
	void deleteAllStudentInfo(Integer id);

}
