package com.corejava.assignment.InnerClasses;

public class AccessOuterClassFromInnerClass 
{
	int number1= 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return number1;
	    }
	  }
}
