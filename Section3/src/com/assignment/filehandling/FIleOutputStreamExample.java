package com.corejava.assignment.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamExample
{
 public static void main(String[] args) throws FileNotFoundException ,IOException{
	
	 System.out.println("Main method started");
	 String path1="D:/programming/Sample/FileHandling/second.txt";
		FileOutputStream fileoutputstream1= new FileOutputStream(path1);
		fileoutputstream1.write('A');
		System.out.println("Char inserted");
		System.out.println("--------------------------");
		String path2= "D:/programming/Sample/FileHandling/third.txt";
		FileOutputStream fileoutputstream2= new FileOutputStream(path2);
		
		String string1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] byte1=string1.getBytes();
		
		fileoutputstream2.write(byte1);
		System.out.println("Char stream inserted");
		System.out.println("Main method Ended");
		
		
}
}
