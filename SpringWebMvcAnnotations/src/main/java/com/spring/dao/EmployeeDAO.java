package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.commandbeans.EmployeeFormBean;

//@Repository
@Component
public class EmployeeDAO {
   @Autowired
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
		//Object[] obj={employee.getEno(),employee.getName(),employee.getSalary()};
		//int update = jdbcTemplate.update("insert into employee values(?,?,?)",obj);
		//return update;
		
	}
	
	
	
}
