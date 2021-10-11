package com.fileHandling11;

import java.io.FileInputStream;

public class Reading1 
{
  public static void main(String[] args) throws Exception 
  {
	String s1="R:\\Rohit\\Programming\\new.txt";
	FileInputStream f1 =new FileInputStream(s1);
	int a=f1.read();
	System.out.println((char)a);
	System.out.println("Read successfully");
	System.out.println("--------------------------------");
	String s2="R:\\Rohit\\Programming\\new2.txt";
	FileInputStream f2 =new FileInputStream(s2);
	int x=0;
	while((x=f2.read())!=-1)
	{
		System.out.print((char)x);
	}
	System.out.println();
	System.out.println("Read successfully");
}
}
