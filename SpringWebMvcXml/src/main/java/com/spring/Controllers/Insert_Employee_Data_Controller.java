package com.spring.Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.commandbeans.EmployeeFormBean;
import com.spring.service.EmployeeService;

public class Insert_Employee_Data_Controller implements Controller{

	
private EmployeeService service;

	public EmployeeService getService() {
	return service;
}

public void setService(EmployeeService service) {
	this.service = service;
}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		EmployeeFormBean employee=new EmployeeFormBean();
		employee.setEno(Integer.parseInt(request.getParameter("eno")));
		employee.setName(request.getParameter("name"));
		employee.setSalary(Double.parseDouble(request.getParameter("salary")));
		
		service.insertRecords(employee);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("display");
		return mav;
	}

}


