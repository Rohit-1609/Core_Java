package com.corejava.assignment.classandObject;

public class TestMobile {

	public static void main(String[] args) 
	{
		
	   Mobile m1= new Mobile(98765, 15000, "oppo", "Black");
	   System.out.println("IMEI no is:"+m1.imei);
	   System.out.println("Price is:"+m1.price);
	   System.out.println("Color is:"+m1.Color);
	   System.out.println("Brand is:"+m1.brand);
	   m1.call();
	   m1.msg();;
	  
	}

}
