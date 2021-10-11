package com.corejava.assignment.filehandling;

import java.io.File;

public class CreateFolder
{
 public static void main(String[] args) {
	System.out.println("Main method started");
	String path= "D:/Programming/Sample/FileHandling";
	File file = new File(path);
	boolean result= file.mkdir();
	System.out.println("Result :- "+result);
	
	System.out.println("Main method Ended");
}
}
