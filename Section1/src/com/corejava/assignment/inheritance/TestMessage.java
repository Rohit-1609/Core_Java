package com.corejava.assignment.inheritance;

import com.corejava.assignment.inheritance.Messaging;
public class TestMessage {

	public static void main(String[] args) 
	{
		System.out.println("Main method Started");
		User user1= new User();
		user1.sendmsg(new Messaging());
	    user1.sendmsg(new Whatsapp());
	    user1.sendmsg(new Hikeapp());
	    user1.sendmsg(new Telegramapp());
	    
		System.out.println("Main method ended");


	}

}