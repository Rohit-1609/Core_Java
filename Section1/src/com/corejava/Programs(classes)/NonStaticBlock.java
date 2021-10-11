package com.corejava;

public class NonStaticBlock 
{
  int a=10;
  void test()
  {
	  System.out.println("Running test");
  }
  {
	  System.out.println("Running nonstatic block");
  }
  static
  {
	  System.out.println("Running static block");
  }
  public static void main(String[] args)
 {
   System.out.println("main method started");
   NonStaticBlock n1=new NonStaticBlock();
   n1.test();
   NonStaticBlock n2= new NonStaticBlock();
   n2.test();
   System.out.println("main method ended");
}
}
