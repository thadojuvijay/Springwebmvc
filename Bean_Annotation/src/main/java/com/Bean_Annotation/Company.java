package com.Bean_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Company 
{
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}

	
	
}
