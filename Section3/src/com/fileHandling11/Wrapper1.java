package com.fileHandling11;

public class Wrapper1 
{
public static void main(String[] args)
{
	int a=10;
	System.out.println(a);
	
	Integer x=a;
	System.out.println(x);
   	System.out.println("AutoBoxing");
	System.out.println("----------------------------");
	
	Integer b=30;
	System.out.println(b);
	int c=b;
	System.out.println(c);
	System.out.println("AutoUnBoxing");
}
}
