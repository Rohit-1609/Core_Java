package com.corejava.assignment.abstractclass;

import com.corejava.assignment.abstractclass.*;

public class TestEmployeeInterface
{
	public static void main(String[] args) {
		
	System.out.println("Employee id is:"+ EmployeeInterface.id);
	HumanResourse humanresourse= new HumanResourse();
	humanresourse.detail("Rohit", 15000);
	System.out.println("-----------------------------------");
	EmployeeInterface employeeinterface1= new HumanResourse();
	employeeinterface1.detail("suresh", 14000.5);
}
}