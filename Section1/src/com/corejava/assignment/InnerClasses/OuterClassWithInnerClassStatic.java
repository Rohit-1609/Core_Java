package com.corejava.assignment.InnerClasses;

public class OuterClassWithInnerClassStatic
{
	double number1= 50;
	   public void multiply(double num1, double num2)
	    {
	    	System.out.println(num1*num2);
	    }

	  public static  class Innerclass
	  {
		  double number2=100;
	   public void divide(double num1, double num2)
	  {
		  System.out.println(num1/num2);
	  }
	  }

}
