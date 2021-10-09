package com.corejava.assignment.InnerClasses;

import com.corejava.assignment.InnerClasses.OuterClass.Innerclass;

public class TestOuterClass1 {

	public static void main(String[] args) 
	{
		OuterClass outerclass = new OuterClass();
		OuterClass.Innerclass innerclass= outerclass.new Innerclass();
		System.out.println(outerclass.number1);
		System.out.println(innerclass.number2);
		System.out.println(outerclass.number1 + innerclass.number2);
	    System.out.println(outerclass.number1 - innerclass.number2);
		outerclass.multiply(outerclass.number1, innerclass.number2);
   		innerclass.divide(outerclass.number1, innerclass.number2);

	}

}
