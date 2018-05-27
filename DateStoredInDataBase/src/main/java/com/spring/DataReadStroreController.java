package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataReadStroreController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@RequestMapping("/home")
	public String displayHomePage(){
		return "Home.jsp";
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String storeDate(@RequestParam("ddate")String date){
		int i=0;
		String res;
	java.sql.Date resDate=	java.sql.Date.valueOf(date);
	System.out.println("date---"+date+"---jdncTemplate---"+jdbcTemplate);
	
	String sql="insert into datetable values(?,?,?)";
	Object obj[]={1,"vijay",resDate};
	
	int isSaved=jdbcTemplate.update(sql,obj);
	        if(isSaved==1){
	        	res="datestored successfully";
	        }else{
	        	res="date is not stored";
	        }
    	return res;
	}
	
	

}
