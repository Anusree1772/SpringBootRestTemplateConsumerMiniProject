package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student s);
	List<Student> getAllStudents();
}
