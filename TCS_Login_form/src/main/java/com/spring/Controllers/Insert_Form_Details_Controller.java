package com.spring.Controllers;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.commandbeans.Tcs_Registration;
import com.spring.service.EmployeeService;

public class Insert_Form_Details_Controller implements Controller{

	
private EmployeeService service;

	public EmployeeService getService() {
	return service;
}

public void setService(EmployeeService service) {
	this.service = service;
}

public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

	Part filePart = request.getPart("Dp");
	InputStream dp = filePart.getInputStream();
	
	Tcs_Registration registration=new Tcs_Registration();
	registration.setDp(dp);
	ModelAndView mav=new ModelAndView();
	mav.setViewName("display.jsp");
	return mav;
}



}
