package com.fileHandling11;

import java.io.File;

public class Deletefolder
{
 public static void main(String[] args) 
 {
	 String s1="R:\\Tembhu";
	 File f1= new File(s1);
	 if(f1.exists())
	 {
		 f1.delete();
		 System.out.println("Folder deleted succesfully");
	 }
	 else
	 {
		 System.out.println("Sorry! folder don't exist ");
	 }
	 
}
}
