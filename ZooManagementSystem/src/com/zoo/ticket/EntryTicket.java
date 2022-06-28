package com.zoo.ticket;

public class EntryTicket {
private double price;
private int ticketNum;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getTicketNum() {
	return ticketNum;
}
public void setTicketNum(int ticketNum) {
	this.ticketNum = ticketNum;
}

public static void entry() {
	EntryTicket e=new EntryTicket();
	e.setPrice(700);
	e.setTicketNum(123543789);
	System.out.println(e.getPrice());
	System.out.println(e.getTicketNum());
}

public void enjoy()
{
	System.out.println("enjoy the day...........");
}
}
