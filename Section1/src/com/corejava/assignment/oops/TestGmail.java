package com.corejava.assignment.oops;

public class TestGmail 
{
   public static void main(String[] args)
   {
	   Gmail gmail= new Gmail("Rohit","Rohit@123");
		System.out.println("Before Manipulation");
		System.out.println("Username :"+gmail.getUsername());
		System.out.println("Password :"+gmail.getPassword());
		
		
		System.out.println("----------------------------------");
		gmail.setPassword("Rohit@555");
		System.out.println("After MAnipulation");
		System.out.println("Username :"+gmail.getUsername());
		System.out.println("Password :"+gmail.getPassword());
		
}
}
