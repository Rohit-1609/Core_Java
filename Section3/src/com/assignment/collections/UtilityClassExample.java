package com.corejava.assignment.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UtilityClassExample
{
 public static void main(String[] args) {
	
	 ArrayList arraylist1= new ArrayList();
	 arraylist1.add(11);
	 arraylist1.add(77);
	 arraylist1.add(33);
	 arraylist1.add(22);
	 arraylist1.add(22);
	 arraylist1.add(55);
	 arraylist1.add(44);
	 arraylist1.add(66);
	 arraylist1.add(88);
	  System.out.println(arraylist1);
	  System.out.println(Collections.max(arraylist1));
	  System.out.println(Collections.min(arraylist1));
	  System.out.println(Collections.frequency(arraylist1,22));
	  System.out.println("----------------------------");
	  Collections.sort(arraylist1);
	  System.out.println(arraylist1);
	  System.out.println("------------------------------");
	  Collections.reverse(arraylist1);
	  System.out.println(arraylist1);
	  System.out.println("--------------------------------");
	  Collections.swap(arraylist1, 4, 5);
	  System.out.println(arraylist1);
	  System.out.println("--------------------------------");
	  Collections.shuffle(arraylist1);
	  System.out.println(arraylist1);
	  System.out.println("--------------------------------");
	  System.out.println("retriving using Iterator");
	  Iterator iterator =arraylist1.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.println(iterator.next());
	  }
	  
}
}
