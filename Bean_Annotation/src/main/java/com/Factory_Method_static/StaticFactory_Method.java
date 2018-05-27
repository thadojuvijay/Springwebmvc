package com.Factory_Method_static;

public class StaticFactory_Method
{
private static  Employee employee=new Employee();

private StaticFactory_Method() {
	
}
public static Employee createInstance()
{
	return employee;
}
}
