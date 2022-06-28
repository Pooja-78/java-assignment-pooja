package com.zoo.emp;
import com.zoo.emp.Employee;

public class SupportEmployee extends Employee {


public static void emp() {
	
SupportEmployee ep=new SupportEmployee();
ep.setName("sai");
ep.setAge(23);
ep.setContact(9700775313L);
ep.setAddress("Tumkur");
ep.setDesignation("manager");

System.out.println(ep.getName());
System.out.println(ep.getAge());
System.out.println(ep.getContact());
System.out.println(ep.getAddress());
System.out.println(ep.getDesignation());
}

public void work()
{
	System.out.println("manager: gives salary to the employee");
}
}

