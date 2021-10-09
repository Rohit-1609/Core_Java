package com.corejava.assignment.InnerClasses;

public class TestMemberOuterClass1 
{
	private int number1=30;  
	
	 class InnerClass
	 {  
	  void msg()
	  {
		  System.out.println("data is "+number1);
	  }  
	 }  
	 
	 public static void main(String args[])
	 {  
	  TestMemberOuterClass1 outerclass=new TestMemberOuterClass1();
	  TestMemberOuterClass1.InnerClass innerclass= outerclass.new InnerClass();
	  innerclass.msg();  
	 }  
}
