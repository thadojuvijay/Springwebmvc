package com.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.commandbeans.EmployeeFormBean;
import com.spring.service.EmployeeService;

@Controller
//@ComponentScan(basePackages={"com.spring.utility.*"})
public class EmpController 
{
	@Autowired
	private EmployeeService empService;
	
	
	@RequestMapping("/home")
	public String getHome(){
		return "Home.jsp";
	}
	
	
	public EmployeeService getEmpService() {
		return empService;
	}


	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}

	@RequestMapping("/insert")
	public String insertRecords(EmployeeFormBean employee)
	{
		System.out.println("empController=================================");
		empService.insertRecords(employee);
		System.out.println(employee.getName()+"-----"+employee.getSalary());
		
		return "display.jsp";
	}
}
