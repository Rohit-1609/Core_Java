package com.corejava.assignment.abstractclass;

public class HumanResourse implements EmployeeInterface
{
	@Override
	  public void detail(String name,double salary)
	  {
		  System.out.println("Employee name is:"+name);
		  System.out.println("Employee salary is :"+salary);
	  }
}
