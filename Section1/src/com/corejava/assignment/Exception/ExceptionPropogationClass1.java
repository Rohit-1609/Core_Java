package com.corejava.assignment.Exception;

public class ExceptionPropogationClass1 
{
   public void test()
   {
	   System.out.println("Execute test1 method");
	   new ExceptionPropogationClass2().test2();
   }
}
