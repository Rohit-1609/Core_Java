package com.corejava.assignment.classandObject;

import com.corejava.assignment.oops.Gmail;

public class TestGmail {

	public static void main(String[] args) 
	{
		 Gmail g= new Gmail("Rohit","Rohit@123");
			System.out.println("Before Manipulation");
			System.out.println("Username :"+g.getUsername());
			System.out.println("Password :"+g.getPassword());
			
			
			System.out.println("----------------------------------");
			g.setPassword("Rohit@555");
			System.out.println("After MAnipulation");
			System.out.println("Username :"+g.getUsername());
			System.out.println("Password :"+g.getPassword());
			

	}

}
