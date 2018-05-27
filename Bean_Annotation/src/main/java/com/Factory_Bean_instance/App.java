package com.Factory_Bean_instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("FactoryBean_instance.xml");
    	Object bean = container.getBean("emp");
    	System.out.println(bean);
    	Employee employee=(Employee)bean;
    	System.out.println(employee);
    	
    }
}
