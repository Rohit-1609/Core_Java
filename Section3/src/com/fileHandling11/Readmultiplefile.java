package com.fileHandling11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Readmultiplefile
{ 
	public static void main(String[] args) throws IOException 
	{
	  String s1="R:\\Rohit\\Programming\\pune.txt";
	  String s2= "R:\\Rohit\\Programming\\maharashtra.txt";
	  FileInputStream f1= new FileInputStream(s1);
	  FileInputStream f2= new FileInputStream(s2);
	  SequenceInputStream sq1=new SequenceInputStream(f1,f2);
	  
	  int x=0;
	  while((x=sq1.read())!=-1)
	  {
		  System.out.print((char)x);
	  }
	}

}


