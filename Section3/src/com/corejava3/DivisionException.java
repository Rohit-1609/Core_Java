package com.corejava3;

public class DivisionException
{
 public static void main(String[] args)
 {
	 System.out.println("main method started");
	 try
	 {
	 System.out.println(10/0);
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("Arithmatic Exception Handled");
	
	 }
	 System.out.println("main method ended");
	 
}
}