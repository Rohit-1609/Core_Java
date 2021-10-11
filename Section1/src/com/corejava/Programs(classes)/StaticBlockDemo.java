package com.corejava;

public class StaticBlockDemo 
{
   static int a;
   static void test()
   {
	   
	   System.out.println("running static");
   }
   static
   {
	   System.out.println("running static block");
   }
   public static void main(String[] args) 
   {
	System.out.println("main method started");
  
  System.out.println(a);
  System.out.println("main method ended");
}
}