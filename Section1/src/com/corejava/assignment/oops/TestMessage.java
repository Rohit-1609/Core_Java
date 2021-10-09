package com.corejava.assignment.oops;

public class TestMessage {

	public static void main(String[] args) 
	{
		System.out.println("Main method Started");
		User user= new User();
		user.sendmsg(new Hikeapp());     //pass new hikeapp object to assign object to messaging ref
		user.sendmsg(new Whatsapp());
	    user.sendmsg(new Telegramapp());	
		System.out.println("Main method ended");

	}

}
