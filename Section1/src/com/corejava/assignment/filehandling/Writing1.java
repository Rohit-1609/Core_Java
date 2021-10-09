package com.corejava.assignment.filehandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writing1
{
public static void main(String[] args) 
{
	String path="D:/programming/Sample/FileHandling/first.txt";
	String string1="This is a data";
	FileWriter filewriter= null;
	
	try {
		filewriter= new FileWriter(path);
		filewriter.write(string1);
		System.out.println("Data Written");
	}
	catch (IOException e) {	
		e.printStackTrace();
	}
	finally {
		try {
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
}
