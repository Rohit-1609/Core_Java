package com.corejava;

public class Gmail2Consarg 
{
	String username;
	String password;
	
	public Gmail2Consarg(String username,String password)
	{
     System.out.println("Object Created");
     this.username=username;
     this.password=password;
	}
	
	void details()
	{
		System.out.println("UserName: "+username);
		System.out.println("Password: "+password);
		
	}
}
