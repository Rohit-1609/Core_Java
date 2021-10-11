package com.corejava;

public class SampleStaticBlock
{
  static int a;
  static int b=10;
  static
  {
	  System.out.println("Running First static");
	  System.out.println(a);
	  System.out.println(b);
	  a=10;
	  b=20;
	  
  }
  public static void main(String[] args) 
  {
	System.out.println("Main method started");
	System.out.println(a);
	System.out.println(b);
	int a=25;
	int b=80;
	System.out.println(a);
	System.out.println(b);
	a=23;
	System.out.println(a);
	System.out.println("main method ended");
}
  static
  {
	System.out.println("Running Second Static");
	System.out.println(a);
	System.out.println(b);
	a=45;
  }
}
