package com.corejava.assignment.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample 
{
 public static void main(String[] args)
 {
	 Employee employee1= new Employee(7, "Ramesh", 7000);
	  Employee employee2= new Employee( 17, "Suresh", 6000);
	  Employee employee3= new Employee( 2, "Kamlesh", 9000);
	  Employee employee4= new Employee( 10, "Dilesh", 10000);
	  Employee employee5= new Employee( 13, "Rajesh", 2000);
	  Employee employee6= new Employee( 13, "yogesh", 2500);
	  
	  TreeMap treemap= new TreeMap();
	  treemap.put("Ramesh", employee1);
	  treemap.put("Suresh", employee2);
	  treemap.put("Kamlesh", employee3);
	  treemap.put("Dilesh", employee4);
	  treemap.put("Rajesh", employee5);
	  treemap.put("yogesh", employee6);
	  
	  System.out.println("Putput of entry set:-");
	  Set set= treemap.entrySet();
	  for(Object object:set)
	  {
		  System.out.println(object);
	  }
	  
	  
}
}
