package com.corejava;

public class DemoNonStaticBlock 
{
   static int a;
   static int b;
   int x;
   int y;
   static
   {
	   System.out.println("Running first static");
	   System.out.println(a);
	   System.out.println(b);
   }
   {
	   System.out.println("Running first nonstatic ");
	   a=15;
	   b=20;
	   x=22;
	   y=90;
   }
   static 
   {
	   System.out.println("Running second static");
	   System.out.println(a);
	   System.out.println(b);
	   a=60;
	   b=70;
   }
   public static void main(String[] args)
 {
	System.out.println("main method started");
	System.out.println(a);
	System.out.println(b);
	DemoNonStaticBlock d1= new DemoNonStaticBlock();
	System.out.println(d1.x);
	System.out.println(d1.y);
	System.out.println(a);
	System.out.println(b);
	System.out.println("mme");
	}
   {
	   System.out.println("Running second nonstatic ");
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(x);
	   System.out.println(y);
	   a=12;
	   
   }
}