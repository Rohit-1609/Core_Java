package com.corejava.assignment.Exception;

public class Jdbc 
{
 public void connecttodb(String username,String password) throws Exception
 {
	 if(username=="java" && password== "1234")
	 {
	   System.out.println("Proceed to connections");	 
	 }
	 else
	 {
		 throw new InvalidDataExceptionCustom();
	 }
	 
 }
}
