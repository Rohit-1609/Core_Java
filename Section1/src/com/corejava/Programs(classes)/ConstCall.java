package com.corejava;

public class ConstCall
{
 ConstCall()
 {
	 this(2,8.5);
	 System.out.println("Running Zero Arg Constructor");
 }
 ConstCall(int a)
 {
	 this();
	 System.out.println("Running int arg const");
 }
 ConstCall(int a,double b)
 {
	 System.out.println("Running int double arg const");
 }
}
