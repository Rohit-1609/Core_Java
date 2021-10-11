package com.corejava2;

public class TestGmail
{
 public static void main(String[] args) {
	Gmailencap g= new Gmailencap("Samba","Samba@123");
	System.out.println("Before Manipulation");
	System.out.println("Username :"+g.getUsername());
	System.out.println("Password :"+g.getPassword());
	
	
	System.out.println("----------------------------------");
	g.setPassword("Samba@555");
	System.out.println("After MAnipulation");
	System.out.println("Username :"+g.getUsername());
	System.out.println("Password :"+g.getPassword());
	
}
}
