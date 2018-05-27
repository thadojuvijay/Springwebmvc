package com.Autowired_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Container_App 
{
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(Employee.class);
	String[] beanDefinitionNames = container.getBeanDefinitionNames();
	
	for(int i=0;i<beanDefinitionNames.length;i++)
	{
		System.out.println(beanDefinitionNames[i]);
	}
	
	Employee employee = container.getBean(Employee.class);
	System.out.println(employee);
	
	
}
}
