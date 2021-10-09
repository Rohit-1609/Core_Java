package com.corejava.assignment.Exception;

public class TestJdbcconnection
{ 
 public static void main(String[] args) throws Exception 
 {
	 
	 
		 
		try {
			new Jdbc().connecttodb("javaa", "1234");
		} catch (InvalidDataExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
}
