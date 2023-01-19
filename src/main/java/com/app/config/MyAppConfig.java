package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyAppConfig {

	@Bean
	public RestTemplate m1()
	{
		return new RestTemplate();
	}
	
	@Bean
	public HttpHeaders m2()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		return headers;
	}
}
