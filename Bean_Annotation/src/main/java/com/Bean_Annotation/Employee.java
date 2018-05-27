package com.Bean_Annotation;

import org.springframework.beans.factory.annotation.Value;

public class Employee 
{

@Value("123")	
private Integer eno;
@Value("vijay")
private String name;
@Value("76788")
private Integer salary;



@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
}





}
