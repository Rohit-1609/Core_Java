package com.fileHandling11;
import java.util.*;
import java.io.FileInputStream;

public class Properties
{
  public static void main(String[] args)
  {
	String s1="R:\\Rohit\\Programming\\Sample.properties";
	FileInputStream f1= new FileInputStream(s1);
	Properties p= new Properties();
	
	p.load(f1);
	System.out.println(p.getProperties(Username));
	System.out.println(p.getProperties(Password));
}
}
