package com.corejava.assignment.oops;


public class Testpoly {

	public static void main(String[] args) 
	{
		Employee employee = new Employee();
		 employee.Search(25);
		 
		 System.out.println("--------------------------");
		 employee.Search("sachin");
		 System.out.println("-----------------------------");
		 employee.Search("Ram", 123456789);
		 
	}

}
