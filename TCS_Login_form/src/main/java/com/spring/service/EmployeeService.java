package com.spring.service;


import com.spring.commandbeans.Tcs_Registration;
import com.spring.dao.EmployeeDAO;


public class EmployeeService {
	private EmployeeDAO  empdao;
	
	public EmployeeDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDAO empdao) {
		this.empdao = empdao;
	}

	
	public void insertphoto(Tcs_Registration registration)
	{
empdao.insertphoto(registration);
	
		
	}
	
}
