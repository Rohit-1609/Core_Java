package com.corejava.assignment.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile
{
  public static void main(String[] args)
  {
	System.out.println("Main method Started");
	String path="D:/programming/Sample/FileHandling/first.txt";
	File file= new File(path);
	boolean result;
	
    try {
		result=file.createNewFile();
		System.out.println("Result:-"+result);
	} 
    catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("Main method ended");
}
}
