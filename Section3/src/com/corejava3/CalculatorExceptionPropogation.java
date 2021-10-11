package com.corejava3;

public class CalculatorExceptionPropogation
{
 void add(int a,int b)
 {
	 System.out.println("Running Add...");
	 System.out.println(a+b);
 }
 void div(int a,int b)
 {
	 System.out.println("Running div....");
	 System.out.println(a/b);
	 add(a,b);
	 
 }
 void sub(int a,int b)
 {
	 System.out.println("Running Sub....");
	 System.out.println(a-b);
	 div(a,b);
 }
}
