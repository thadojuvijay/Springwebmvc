package com.spring.service;


import com.spring.commandbeans.EmployeeFormBean;
import com.spring.dao.EmployeeDAO;


public class EmployeeService {
	private EmployeeDAO  empdao;
	
	public EmployeeDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDAO empdao) {
		this.empdao = empdao;
	}

	public int insertRecords(EmployeeFormBean employee)
	{
		System.out.println("empService()===============================");
		return empdao.insertRecords(employee);
	}
}
