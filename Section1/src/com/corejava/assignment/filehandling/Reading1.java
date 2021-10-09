package com.corejava.assignment.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reading1 
{
  public static void main(String[] args) {

		String path="D:/programming/Sample/FileHandling/first.txt";
		
		FileReader filereader= null;
		try
		{
		filereader=new FileReader(path);
		int a=filereader.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a=filereader.read();
		}
		}
		catch (FileNotFoundException f) {
			f.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				filereader.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
}
}
