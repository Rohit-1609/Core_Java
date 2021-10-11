package com.corejava2;

public  class Car extends vehicle
{
	Car(String name,double price)
	{
		super(name,price);
	}
	@Override
	void detail()
	{
		System.out.println("Car name is:"+name);
		System.out.println("Car price is : "+price);
	}
	

}
