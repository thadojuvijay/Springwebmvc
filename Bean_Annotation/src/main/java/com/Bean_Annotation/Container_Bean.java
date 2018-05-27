package com.Bean_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Container_Bean 
{
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(Company.class);
	String[] beanDefinitionNames = container.getBeanDefinitionNames();
	for (String s : beanDefinitionNames) {
		
		System.out.println(s);
	}
	Object bean = container.getBean("getEmployee");
	System.out.println(bean);
	Employee employee=(Employee)bean;
	

}
}
