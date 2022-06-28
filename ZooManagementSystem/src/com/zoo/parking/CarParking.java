package com.zoo.parking;

public class CarParking implements IParking{
private String name;
private String vehnum;
private int ticketPrice;

public int getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(int ticketPrice) {
	this.ticketPrice = ticketPrice;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVehnum() {
	return vehnum;
}
public void setVehnum(String vehnum) {
	this.vehnum = vehnum;
}


public void parking()
{
	CarParking p=new CarParking();
	p.setName("cars");
	p.setTicketPrice(2000);
	p.setVehnum("AP-0000");
	
	System.out.println(p.getName());
	System.out.println(p.getTicketPrice());
	System.out.println(p.getVehnum());
}

public void stop()
{
	System.out.println("park the car ");
}

public void buyTicket()
{
	System.out.println("buy parking ticket for the car ");
}
}
