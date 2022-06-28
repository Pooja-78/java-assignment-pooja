package com.zoo.emp;
import com.zoo.emp.Employee;
public class HealthSupport extends Employee{

	public static void emp() {
	Employee hs=new HealthSupport();
	hs.setName("pooja");
	hs.setAge(24);
	hs.setContact(9380031978L);
	hs.setAddress("banglore");
	hs.setDesignation("Doctor");

	System.out.println(hs.getName());
	System.out.println(hs.getAge());
	System.out.println(hs.getContact());
	System.out.println(hs.getAddress());
	System.out.println(hs.getDesignation());
	}

	public void work()
	{
		System.out.println("Doctor gives treatment");
	}

}
