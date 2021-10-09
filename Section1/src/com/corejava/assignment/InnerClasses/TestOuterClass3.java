package com.corejava.assignment.InnerClasses;

public class TestOuterClass3 {

	public static void main(String[] args)
	{
	AccessOuterClassFromInnerClass outerclass = new AccessOuterClassFromInnerClass();
	AccessOuterClassFromInnerClass.InnerClass innerclass = outerclass.new InnerClass();
	System.out.println(innerclass.myInnerMethod());

	}

}
