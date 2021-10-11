package com.fileHandling11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing1
{
  public static void main(String[] args) throws IOException 
  {
	String s1="R:\\Rohit\\Programming\\Sample.txt";
	FileOutputStream f1= new FileOutputStream(s1);
	f1.write('A');
	System.out.println("Char inserted");
	System.out.println("--------------------------");
	String s2= "R:\\Rohit\\Programming\\Demo.txt";
	FileOutputStream f2= new FileOutputStream(s2);
	
	String s="ABCDEFG";
	byte[] b=s.getBytes();
	
	f2.write(b);
	System.out.println("Char stream inserted");
	
	
	
}
}
