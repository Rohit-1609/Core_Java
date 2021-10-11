package com.corejava;

public class Demo3nonstaticblock
{
 static int a;
 static int b=66;
 int c;
 int d=22;
 static
 {
	 System.out.println("Running first static");
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(new Demo3nonstaticblock().c);
 }
 {
	 System.out.println("Running first nonStatic");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    a=d;
    c=b;
 }
 static
 {
	 System.out.println("Running Second static");
	 a=88;
	 b=55;
	 System.out.println(a+b);
 }
 {
	 System.out.println("Running second nonstatic");
	 System.out.println(a);
	 System.out.println(b);
 }
 
 public static void main(String[] args)
 {
	System.out.println("main method started");
	System.out.println(a);
	System.out.println(b);
	Demo3nonstaticblock d3=new Demo3nonstaticblock();
	System.out.println(d3.c);
	System.out.println(d3.d);
	System.out.println(a);
	System.out.println(b);
}
}
