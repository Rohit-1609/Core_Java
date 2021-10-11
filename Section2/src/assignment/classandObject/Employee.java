package com.corejava.assignment.classandObject;

public class Employee 
{
  int empid;
  String name;
  String Companyname;
  double salary;
  String desg;
  
  {
	  System.out.println("Running non static block");
	  empid=3001;
	  name="Rahul";
	  Companyname="Infosys";
	  salary= 40000;
	  desg="Project Manager";
	  
  }
  
  public static void main(String[] args) {
	Employee e1= new Employee();
	System.out.println(e1.Companyname);
	System.out.println(e1.empid);
	System.out.println(e1.name);
	System.out.println(e1.desg);
	System.out.println(e1.salary);
}
}
