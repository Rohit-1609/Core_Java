package com.corejava.assignment.Exception;

public class MultipleExceptionInSingleCatch 
{
   public static void main(String[] args) 
   {
	   try
		 {
			 System.out.println(10/0);
			 
		 }
		 catch(ArithmeticException |NullPointerException a)
		 {
			 System.out.println("Exception handled");
			 if(a instanceof ArithmeticException)
			 {
				 System.out.println("Arithmetic Exception ");
			 }
			 else
			 {
				 System.out.println("Null pointer exception");
			 }
		 }
}
}
