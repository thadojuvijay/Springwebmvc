package com.spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Configuration
public class Address 
{
@Value("sec-bad")	
private String street;
@Value("Hyd")
private String city;

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}





@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}









}
