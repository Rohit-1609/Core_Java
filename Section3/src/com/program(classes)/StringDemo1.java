package com.corejava3;

public class StringDemo1
{
 public static void main(String[] args) {
	String s1="pune";
	String s2= new String("pune");
	String s3="pune";
	String s4=new String("pune");
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	System.out.println("-----------------------------------------");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s2==s4);
	
	System.out.println("-----------------------------------------");
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s2.equals(s4));
}
}
