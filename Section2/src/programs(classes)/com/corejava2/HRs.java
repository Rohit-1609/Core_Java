package com.corejava2;

public class HRs implements employee 
{
  @Override
  public void detail(String name,double salary)
  {
	  System.out.println("Employee name is:"+name);
	  System.out.println("Employee salary is :"+salary);
  }
}
