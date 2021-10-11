package com.corejava2;

public class Gadget implements Mobile,Laptop
{

	

	@Override
	public void display(double size) {
	System.out.println("Display size is :"+size);
	}

	@Override
	public void price(double amount) {
		System.out.println("price is :"+amount);
		
	}

	@Override
	public void company(String Cname)
	{
		System.out.println("Company name is :"+Cname);
		
	}

}
