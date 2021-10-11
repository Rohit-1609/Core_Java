package com.corejava;

public class Calculator
{
  static int a;
  static int b;
  static void add()
  {
	System.out.println(a+b);
	
  }
  static
  {
	  System.out.println("Running static of calculator");
	  a=15;
	  b=10;	  
  }
}
