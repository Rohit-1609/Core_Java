package com.corejava;

public class Amazon 
{
 static String mobile;
 static double price;
 static void detail()
 {
	 System.out.println("Mobile name is = "+mobile);
	 System.out.println("Mobile price is = "+price);
 }
 static
 {
	 System.out.println("Running Amazon");
	 mobile="Samsung";
	 price=15000;
 }
}

