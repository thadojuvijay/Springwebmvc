package com.Factory_Bean_instance;

public class Factory_Bean
{
private static Employee employee=new Employee();

public Employee createInstance()
{
	return employee;
}
}
