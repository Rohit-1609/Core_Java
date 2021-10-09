package com.corejava.assignment.InnerClasses;

import java.util.Scanner;

 public class OuterClass 
{
	double number1= 50;
   public void multiply(double num1, double num2)
    {
    	System.out.println(num1*num2);
    }

  public class Innerclass
  {
	  double number2=100;
 public void divide(double num1, double num2)
  {
	  System.out.println(num1/num2);
  }
  }


}
  

