package com.corejava.assignment.abstractclass;

import java.util.Scanner;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
    HR hr= new HR();
	hr.campany();
	hr.employeedetails();
	System.out.println("-------------------------------------");
	Employee employee= new HR();
	employee.campany();
	employee.employeedetails();
}

}