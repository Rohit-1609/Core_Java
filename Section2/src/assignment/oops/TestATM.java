package com.corejava.assignment.oops;

public class TestATM {

	public static void main(String[] args) 
	{
		ATM atm=new ATM();
		System.out.println(atm.getPIN());
		System.out.println("---------------------------------------");
		atm.setPIN(9876);
		System.out.println(atm.getPIN());

	}

}
