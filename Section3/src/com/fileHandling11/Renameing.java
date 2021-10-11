package com.fileHandling11;

import java.io.File;

public class Renameing 
{
 public static void main(String[] args)
 {
	String s5="R:\\Rohit";
	String s6= "R:\\Tembhu";
	File f1=new File(s5);
	File f2= new File(s6);
	
	if(f1.exists())
	{
		f1.renameTo(f2);
		System.out.println("Folder Rename SUccessfully");
	}
	else
	{
		System.out.println("Sorry ! Folder does not exist");
	}
} 
}
