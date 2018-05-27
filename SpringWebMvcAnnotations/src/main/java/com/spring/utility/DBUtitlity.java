package com.spring.utility;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
@Configuration
public class DBUtitlity {
	static String cName="oracle.jdbc.driver.OracleDriver";
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:oracle:thin:@localhost:1521:xe","spring", "abc");
		dataSource.setDriverClassName(DBUtitlity.cName);
		System.out.println("DBUtility================================");
		return dataSource;
	}
	@Bean(value={"jdbcTemplate","abc"})
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jdbcTemplate= new JdbcTemplate(getDataSource());
		return jdbcTemplate;
 		}
	
}
