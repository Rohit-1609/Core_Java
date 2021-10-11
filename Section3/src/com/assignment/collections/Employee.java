package com.corejava.assignment.collections;

public class Employee implements Comparable
{
   int id;
   String name;
   double salary;
     public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
     @Override
   public String toString()
   {
	   return " Employee[id= "+id+ " ,name= "+name+ " ,salary= "+salary+" ] ";
   }
     @Override
 	public int compareTo(Object object1)    //sorting by id
 	 {
      Employee employee = (Employee)object1;
      return this.id-employee.id;
 	}
	
     /*@Override
	public int compareTo(Object object) //sorting by name
	{
		Employee employee1= (Employee) object;
	    String string1=this.name;
	    String string2= employee1.name;
		return string1.compareTo(string2);
	}
	*/
     
	/*@Override
	public int compareTo(Object object1)      //sorting by salary
	{
		   Employee employee = (Employee)object1;
		   return (int) ((this.salary-employee.salary)*100);
	
	}*/
	
     
   
   
     
     
     
}
