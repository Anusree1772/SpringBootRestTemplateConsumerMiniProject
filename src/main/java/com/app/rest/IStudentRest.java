package com.app.rest;

import java.util.List;

import com.app.entity.Student;

public interface IStudentRest {

	Integer saveStudent(Student s);
	
	List<Student> getAllStudents();
}
