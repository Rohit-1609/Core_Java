package com.corejava.assignment.abstractclass;

import java.util.Scanner;

public abstract class Employee
{
	int id=1001;
	String name= "Ramesh";
	double salary =20000;
	void campany()
	{
		System.out.println("Company name is samsung");
	}
	abstract void employeedetails();
}
