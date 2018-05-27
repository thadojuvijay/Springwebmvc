package com.Autowired_Xml;

public class Employee 
{
private Integer eno;
private String name;
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

public void setAddress(Address address) {
	this.address = address;
}




@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", address=" + address + "]";
}


}
