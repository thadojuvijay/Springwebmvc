package com.Autowired_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
      String[] beanDefinitionNames = container.getBeanDefinitionNames();
      
      for(int i=0;i<beanDefinitionNames.length;i++)
      {
    	  System.out.println(beanDefinitionNames[i]);
      }
      
      Employee employee = container.getBean(Employee.class);
      System.out.println(employee);
    }
}
