package com.app.rest.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.entity.Student;
import com.app.rest.IStudentRest;

@Component
public class StudentRestImpl implements IStudentRest{

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HttpHeaders headers;
	
	@Override
	public Integer saveStudent(Student s) {
		
		//1.create URL
		String url="http://localhost:8082/v1/api/student/create";
		
		//2.create request headers
		/*
		 * HttpHeaders headers=new HttpHeaders();
		 * headers.setContentType(MediaType.APPLICATION_JSON);
		 */
		
		//3.create response body
		//4.Combine both body and headers
		HttpEntity<Student> requestEntity = new HttpEntity<>(s,headers);
		

		//4. Create RestTemplate object
		

		// Add the Jackson and String message converters
		/*
		 * restTemplate.getMessageConverters().add(new
		 * MappingJackson2HttpMessageConverter());
		 * restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		 */
		
		ResponseEntity<Integer> response=restTemplate.postForEntity(url, requestEntity, Integer.class);
		
		Integer id=response.getBody();
		
		return id;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Student> getAllStudents() {
		
		String url="http://localhost:8082/v1/api/student/all";
		ResponseEntity<List> response=restTemplate.getForEntity(url, List.class);
		
		List<Student> student=response.getBody();
		
		return student;
	}

	
}
