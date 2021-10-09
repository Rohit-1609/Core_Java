package com.corejava.assignment.javaobject;

public class ComparingObjects
{
public static void main(String[] args)
{
	String string1="pune";
	String string2= new String("pune");
	String string3="pune";
	String string4=new String("pune");
	
	System.out.println(string1);
	System.out.println(string2);
	System.out.println(string3);
	System.out.println(string4);
	
	System.out.println("-----------------------------------------");
	System.out.println(string1==string2);           //comparing address of object
	System.out.println(string1==string3);
	System.out.println(string1==string4);
	System.out.println(string2==string4);
	
	System.out.println("-----------------------------------------");
	
	System.out.println(string1.equals(string2));   //compare values of objects
	System.out.println(string1.equals(string3));
	System.out.println(string1.equals(string4));
	System.out.println(string2.equals(string4));
}
}
