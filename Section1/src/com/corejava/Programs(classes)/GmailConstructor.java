package com.corejava;

public class GmailConstructor
{
	String username;
	String password;
	
	public GmailConstructor()
	{
     System.out.println("Object Created");
     username="Rohit";
     password="Rohit@987";
	}
	
	void detail()
	{
		System.out.println("UserName: "+username);
		System.out.println("Password: "+password);
		
	}
}
