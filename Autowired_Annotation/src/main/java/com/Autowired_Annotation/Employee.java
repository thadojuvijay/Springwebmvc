package com.Autowired_Annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.Address;

@Configuration
//@ComponentScan("com.spring")// if you write just companentScan
                               //it will just scan this package only
//if you want to scan  different packages classes.we will use base packages.
@ComponentScan
public class Employee 
{

@Value("1")	
private Integer eno;
@Value("vijay")
private String name;

//@Autowired
private Address address;


public Integer getEno() {
	return eno;
}

public void setEno(Integer eno) {
	this.eno = eno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public Address getAddress() {
	return address;
}
@Autowired(required=false)
public void setAddress(Address address) {
	this.address = address;
}




@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", address=" + address + "]";
}


}
