package com.Collections;

import java.util.ArrayList;

import com.corejava3.CarDB;

public class ArrayListDemo 
{
 public static void main(String[] args) 
 {
	 ArrayList al=new ArrayList();
	 al.add("One");
	 al.add(2);
	 al.add(3.2);
	 al.add(2);
	 al.add(null);
	 al.add('A');
	 al.add(new CarDB());
	 System.out.println(al.isEmpty());
	 System.out.println(al.size());
	 System.out.println(al.contains(null));
	 System.out.println(al.get(4));
	 System.out.println(al.get(5));
     System.out.println("--------------------------------");
     System.out.println(al);
     System.out.println("--------------------------------");
     al.add(3,"XYZ");
     System.out.println(al.get(3));
     System.out.println(al.get(4));
     System.out.println(al.get(5));
     System.out.println("--------------------------------");
     al.remove(3);
     System.out.println(al);
     al.set(3, "SDF");
     System.out.println(al);
     System.out.println("-------------------------------");
     al.clear();
     System.out.println(al);
 
 }
}
