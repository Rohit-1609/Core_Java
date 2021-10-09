package com.corejava.assignment.classandObject;

import java.util.Scanner;

public class Mobile
{
	 
       long imei;
	   double price;
	   String brand;
	   String Color;
	
	public Mobile(long imei, double price, String brand, String color)
	{
		super();
		this.imei = imei;
		this.price = price;
		this.brand = brand;
		this.Color = color;
	}

	public void call()
	{
		System.out.println("Calling...");
	}
	public void msg()
	{
		System.out.println("Masseging...");
	}
}
