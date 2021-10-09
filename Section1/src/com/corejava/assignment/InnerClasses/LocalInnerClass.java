package com.corejava.assignment.InnerClasses;

public class LocalInnerClass 
{
	private int number1=30;
	//instance variable  
	 void display()
	 {  
	  class Local
	  {  
	   void msg()
	   {
		   System.out.println("The value of number is:-"+number1);
	   }  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 } 
	 public static void main(String args[])
	 {  
	  LocalInnerClass obj=new LocalInnerClass();  
	  obj.display();  
	 }  
}
