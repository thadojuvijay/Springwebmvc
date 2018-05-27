package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.commandbeans.EmployeeFormBean;
import com.spring.dao.EmployeeDAO;

@Service
public class EmployeeService {
	@Autowired
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
