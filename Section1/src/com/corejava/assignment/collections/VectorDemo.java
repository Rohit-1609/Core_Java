package com.corejava.assignment.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo 
{
 public static void main(String[] args) {

		Vector vector= new Vector();
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.add("Hello");
		vector.add('a');
		vector.add(10);
		vector.add(10);
		vector.add(null);
		vector.add('a');
		vector.add(10);
		vector.add("java");
		vector.add(new Employee(1001, "Sachin", 10000.30));
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.add(10);
		vector.add(null);
		vector.add(10);
		vector.add(null);
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector);
		
	    System.out.println("---------------------------------------");
	    Enumeration enumeration= vector.elements();     //fetching or iterating the all elements form vector
	    while(enumeration.hasMoreElements())
	    {
	    	System.out.println(enumeration.nextElement());
	    }
}
}
