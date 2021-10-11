package com.corejava2;

public class JVMdemo
{
 static int a=10;
 int b=20;
 static void test()
 {
	 System.out.println("Running Test");
	 System.out.println(a);
	 int a=50;
	 System.out.println(a);
 }
 
 void view ()
 {
	 System.out.println("Running view");
	 System.out.println(b);
	 int b=84;
	 System.out.println(b);
 }
 static
 {
	 System.out.println("Running static block");
	 a=24;
	 System.out.println(a);
	
 }
 {
	 System.out.println("Running non static block");
	 b=28;
	 System.out.println(b);
 }
 public static void main(String[] args) {
	System.out.println("mms");
	System.out.println(a);
	JVMdemo j1= new JVMdemo();
	System.out.println(j1.b);
	j1.view();
	test();
	System.out.println("main method started");
}
 
}
