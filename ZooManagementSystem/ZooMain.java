package com.zoo.main;

import com.zoo.emp.HealthSupport;
import com.zoo.emp.SupportEmployee;
import com.zoo.parking.BikeParking;
import com.zoo.parking.CarParking;
import com.zoo.ticket.EntryTicket;
import com.zoo.animal.Animal;
import com.zoo.canteen.Canteen;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SupportEmployee e=new SupportEmployee();
e.emp();
e.work();
System.out.println("......................................");

HealthSupport h=new HealthSupport();
h.emp();
e.work();
System.out.println("......................................");


Animal a=new Animal();
a.animal();
a.sleep();
a.woke();
System.out.println("......................................");

CarParking c=new CarParking();
c.parking();
c.stop();
c.buyTicket();
System.out.println("......................................");

BikeParking b=new BikeParking();
b.parking();
b.buyTicket();
b.stop();
System.out.println("......................................");

EntryTicket et=new EntryTicket();
et.entry();
et.enjoy();
System.out.println("......................................");

Canteen ca=new Canteen();
ca.canteen();
ca.eat();

}

}
