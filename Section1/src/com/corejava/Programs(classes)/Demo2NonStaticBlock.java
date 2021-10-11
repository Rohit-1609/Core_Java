package com.corejava;

public class Demo2NonStaticBlock 
{
   static int a=55;
   static int b=5;
   int x;
   int y;
   
   {
	 System.out.println("Running first nonstatic");
     x=a;
     y=b;
   }
   static
   {
	   System.out.println("Running first static");
	   System.out.println(a);
	   System.out.println(b);
	   Demo2NonStaticBlock d3=new Demo2NonStaticBlock();
	   System.out.println(d3.x);
	   System.out.println(d3.y);
   }
   public static void main(String[] args)
   {
	System.out.println("main method started");
	System.out.println(a);
	System.out.println(b);
	Demo2NonStaticBlock d3= new Demo2NonStaticBlock();
	System.out.println(d3.x);
	System.out.println(d3.y);
	System.out.println("main maethod ended");	   
}
   }
