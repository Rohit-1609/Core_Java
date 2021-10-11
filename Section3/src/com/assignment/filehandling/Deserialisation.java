package com.corejava.assignment.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;

public class Deserialisation
{
  public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
	
	    System.out.println("Main method Started");
	    Student1 student1 = null;
	    String path1="D:/programming/Sample/FileHandling/fourth.txt";
	    File file =new File(path1);
	    FileInputStream fileinputstream =null;
	    ObjectInputStream objectinputstream = null;
	  
	  
		fileinputstream= new FileInputStream(file);
		objectinputstream=new ObjectInputStream(fileinputstream);
		student1=(Student1) objectinputstream.readObject();
		System.out.println("Object Readed");
		System.out.println("Student:- "+student1);
		System.out.println("Id is:-"+student1.id);
		System.out.println("Subject is:-"+student1.subject);
		System.out.println("Fees is:-"+student1.fees);
	    System.out.println("Main method Ended");
}
}
