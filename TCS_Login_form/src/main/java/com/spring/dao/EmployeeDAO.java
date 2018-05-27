package com.spring.dao;



import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.commandbeans.Tcs_Registration;

public class EmployeeDAO 
{
	private JdbcTemplate abc;

	public JdbcTemplate jdbcTemplate() {
		return abc;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.abc = jdbcTemplate;
	}
	
	
	
	public void insertphoto(Tcs_Registration registration)
	{
		String sql="insert into whatsapp values(registration.getDp())";
		abc.execute(sql);
	
		
	}
	
	
	
}
