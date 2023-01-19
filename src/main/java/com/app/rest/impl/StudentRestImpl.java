package com.app.rest;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.entity.Student;
import com.app.rest.impl.IStudentRest;

@Component
public class StudentRestImpl implements IStudentRest{

	@Override
	public Integer saveStudent(Student s) {
		
		//1.create URL
		String url="http://localhost:8082/v1/api/student/create";
		
		//2.create request headers
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		//3.create response body
		//4.Combine both body and headers
		HttpEntity<Student> requestEntity = new HttpEntity<>(s,headers);
		
		//4. Create RestTemplate object
		RestTemplate restTemplate = new RestTemplate();

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

	
}
