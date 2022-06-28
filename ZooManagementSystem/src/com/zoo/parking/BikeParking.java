package com.zoo.parking;

public class BikeParking implements IParking {
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
		BikeParking b=new BikeParking();
		b.setName("NS300");
		b.setTicketPrice(2000);
		b.setVehnum("AP-1000");
		
		System.out.println(b.getName());
		System.out.println(b.getTicketPrice());
		System.out.println(b.getVehnum());
	}

	public void stop()
	{
		System.out.println("park the bike ");
	}

	public void buyTicket()
	{
		System.out.println("buy parking ticket for the bike ");
	}

}
