package com.corejava2;

public class Testfatherson 
{
 public static void main(String[] args) {
	Father f= new Father();
	f.property(2, 10.2);
	System.out.println("----------------------------------");
	Son s= new Son();
	s.property(4, 13.7);
}
}
