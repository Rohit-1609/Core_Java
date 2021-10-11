package com.corejava2;

public class TestEmployeepolyM 
{
	public static void main(String[] args) {
 EmployeePolyM e = new EmployeePolyM();
 e.Search(25);
 
 System.out.println("--------------------------");
 e.Search("sachin");
 System.out.println("-----------------------------");
 e.Search("Ram", 123456789);
 
 
}
}