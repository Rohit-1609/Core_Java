package com.corejava.assignment.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{
  public static void main(String[] args) {
	
	  Employee employee1= new Employee(7, "Ramesh", 7000);
	  Employee employee2= new Employee( 17, "Suresh", 6000);
	  Employee employee3= new Employee( 2, "Kamlesh", 9000);
	  Employee employee4= new Employee( 10, "Dilesh", 10000);
	  Employee employee5= new Employee( 13, "Rajesh", 2000);
	  Employee employee6= new Employee( 25, "Rakesh", 3000);
	  Employee employee7= new Employee( 6, "Dipesh", 4000);
	  Employee employee8= new Employee( 19, "Hitesh", 5000);
	  
	  TreeSet treeset = new TreeSet();
	  treeset.add(employee1);
	  treeset.add(employee2);
	  treeset.add(employee3);
	  treeset.add(employee4);
	  treeset.add(employee5);
	  treeset.add(employee6);
	  treeset.add(employee7);
	  treeset.add(employee8);
	  
	  for(Object object:treeset)
	  {
		  System.out.println(object);
	  }
	  
}
	  
}
