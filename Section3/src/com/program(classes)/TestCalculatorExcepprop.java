package com.corejava3;

public class TestCalculatorExcepprop
{
  public static void main(String[] args) 
  {
	 System.out.println("Main method started");
     CalculatorExceptionPropogation c= new CalculatorExceptionPropogation();
     c.sub(10, 0);
     System.out.println("main method ended");
	 
  }
}
