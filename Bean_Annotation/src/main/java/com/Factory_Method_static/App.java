package com.Factory_Method_static;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext container=new ClassPathXmlApplicationContext("FactoryMethod_static.xml");
    	Object object = container.getBean("employee_FactoryMethod");
    	System.out.println(object);
    	Employee employee=(Employee)object;
    	System.out.println(employee);
    	
    	((AbstractApplicationContext)container).close();
    	
    	
    }
}
