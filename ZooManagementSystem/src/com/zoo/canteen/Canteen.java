package com.zoo.canteen;

public class Canteen {
private String menu;
private double price;
public String getMenu() {
	return menu;
}
public void setMenu(String menu) {
	this.menu = menu;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public static void canteen()
{
	Canteen can=new Canteen();
	can.setMenu("pallav");
	can.setPrice(100);
	System.out.println(can.getMenu());
	System.out.println(can.getPrice());
}
public void eat()
{
	System.out.println("eat pallav..");
}
}
