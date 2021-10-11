package com.corejava2;

public abstract class vehicle 
{
 String name;
 double price;
 vehicle(String name,double price)
 {
	 this.name=name;
	 this.price=price;
	 
 }
 abstract void detail();
 
}
