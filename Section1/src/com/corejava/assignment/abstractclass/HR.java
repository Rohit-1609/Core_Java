package com.corejava.assignment.abstractclass;

public class HR extends Employee
{
	@Override
	void employeedetails()
	{
	System.out.println("HR details");
	System.out.println("Id is " +id);
	System.out.println("Name is "+name);
	System.out.println("Salary is "+salary);
}
}