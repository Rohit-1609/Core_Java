package com.corejava3;

public class Stringdemo2 
{
  public static void main(String[] args) {
	String s1="MAHARASHTRA";
	System.out.println(s1);
	System.out.println(s1.isEmpty());
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.startsWith("MAHA"));
	System.out.println(s1.endsWith("MAHA"));
	System.out.println(s1.charAt(5));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(4, 8));
	System.out.println(s1.replace("MAHA", "Raha"));
	System.out.println(s1.subSequence(4, 8));
	System.out.println(s1.contains("MAHA"));
	
	String s2="pune";
	System.out.println(s1.concat(s2));
	
	int a=10;
	System.out.println(a);
	String s3=String.valueOf(a);
	System.out.println(s3);
	String s4="PUNE";
	String s5="pune";
	System.out.println(s4.equals(s5));
	System.out.println(s4.equalsIgnoreCase(s5));
	String s6="Pune-Maharashtra-India";
	System.out.println(s6);
	for(String s7:s6.split("-"))
	{
		System.out.println(s7);
	}
	String s8="India";
	System.out.println(s8);
	char c[]=s8.toCharArray();
	c[2]='D';
	c[4]='A';
	for(char a1:c)
	{
		System.out.println(a1);
	}
	
	
	
	
	
	}
}
