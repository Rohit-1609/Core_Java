package com.corejava2;

public class TestATM 
{
 public static void main(String[] args)
 {
	ATMencap a= new ATMencap();
	System.out.println(a.getPIN());
	System.out.println("---------------------------------------");
	a.setPIN(9876);
	System.out.println(a.getPIN());
	
}
}
