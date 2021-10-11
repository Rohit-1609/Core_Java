package com.corejava.assignment.collections;

import java.util.ArrayList;
import java.util.Iterator;

import com.corejava.assignment.filehandling.Student1;

class ArraylistExample 
{
 public static void main(String[] args) {
	 ArrayList arraylistl=new ArrayList();
	 arraylistl.add("One");
	 arraylistl.add(2);
	 arraylistl.add(3.2);
	 arraylistl.add(2);
	 arraylistl.add(null);
	 arraylistl.add('A');
	 arraylistl.add(new Student1(101, "sql", 12000.50));
	 System.out.println(arraylistl.isEmpty());
	 System.out.println(arraylistl.size());
	 System.out.println(arraylistl.contains(null));
	 System.out.println(arraylistl.get(4));
	 System.out.println(arraylistl.get(5));
     System.out.println("--------------------------------");
     System.out.println(arraylistl);
     System.out.println("--------------------------------");
     arraylistl.add(3,"XYZ");
     System.out.println(arraylistl.get(3));
     System.out.println(arraylistl.get(4));
     System.out.println(arraylistl.get(5));
     System.out.println("--------------------------------");
     arraylistl.remove(3);
     System.out.println(arraylistl);
     arraylistl.set(3, "SDF");
     System.out.println(arraylistl);
     System.out.println("-------------------------------");
     arraylistl.clear();
     System.out.println(arraylistl);
     
     
	  
}
}
