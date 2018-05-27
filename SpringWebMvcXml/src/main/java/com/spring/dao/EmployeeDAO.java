package com.spring.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.commandbeans.EmployeeFormBean;

public class EmployeeDAO 
{
	private JdbcTemplate abc;

	public JdbcTemplate jdbcTemplate() {
		return abc;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.abc = jdbcTemplate;
	}
	
	
	
	public int insertRecords(EmployeeFormBean employee){
		
		System.out.println("empDao++++=========================");
		return abc.update("insert into employee values("+employee.getEno()+",'"+employee.getName()+"',"+employee.getSalary() +")");
	}
	
	
	
}
