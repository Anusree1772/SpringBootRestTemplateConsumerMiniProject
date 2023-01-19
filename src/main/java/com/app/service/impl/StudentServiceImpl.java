package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.rest.impl.IStudentRest;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRest rest;
	
	@Override
	public Integer saveStudent(Student s) {
		
		Integer id=rest.saveStudent(s);
		
		return id;
	}

}
