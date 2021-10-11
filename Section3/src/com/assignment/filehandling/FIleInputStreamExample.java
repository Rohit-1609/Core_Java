package com.corejava.assignment.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamExample 
{
 public static void main(String[] args) throws IOException, FileNotFoundException
 {
	  System.out.println("Main method Started");
		String path1="D:/programming/Sample/FileHandling/second.txt";
		FileInputStream fileinputstream1 =new FileInputStream(path1);
		int a=fileinputstream1.read();
		System.out.println((char)a);
		System.out.println("Read successfully");
		System.out.println("--------------------------------");
		String path2="D:/programming/Sample/FIleHandling/third.txt";
		FileInputStream fileinputstream2 =new FileInputStream(path2);
		int x=0;
		while((x= fileinputstream2.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Read successfully");	
      System.out.println("Main method ended");
 }
}
