package com.corejava.assignment.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation
{
public static void main(String[] args)
{
	System.out.println("main method Started");
	Student1 student = new Student1(12,"java",20000.50);
	System.out.println("Student:- "+student);
	System.out.println("Id is:-"+student.id);
	System.out.println("Subject is:-"+student.subject);
	System.out.println("Fees is:-"+student.fees);
	String path="D:/programming/Sample/FileHandling/fourth.txt";
	File file = new File(path);
	FileOutputStream fileoutputstream= null;
	ObjectOutputStream objectoutputstream= null;
	 
	try
	{
		boolean isFileCreated = file.createNewFile();
		fileoutputstream= new FileOutputStream(file);
		objectoutputstream= new ObjectOutputStream(fileoutputstream);
		objectoutputstream.writeObject(student);
		System.out.println("Object Written");
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			fileoutputstream.close();
			objectoutputstream.close();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	System.out.println("Main method ended");
}

}
