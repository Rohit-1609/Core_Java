package com.corejava.assignment.Exception;

public class MultipleCatch 
{
 public static void main(String[] args)
 {
	 System.out.println("main method started");
		int a[]=new int [5];
		try
		{
		a[5]=60;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Array Index Exception Handled");
		}
		catch (Exception e) {
		   System.out.println("Exception handled by exception");
		}
		System.out.println("main method Ended");
		
		
}
}
