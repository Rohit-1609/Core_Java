package com.corejava.assignment.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample
{
  public static void main(String[] args) {
	
	  HashSet hashset= new HashSet();
	  hashset.add(25);
	  hashset.add("java");
	  hashset.add('R');
	  hashset.add(25);
	  hashset.add(null);
	  hashset.add(21);
	  hashset.add(87);
	  hashset.add(66);
	  hashset.add("apple");
	  hashset.add("hello");
	  hashset.add(45);
	  System.out.println("Hashset element are:");
	  
	  Iterator iterator =hashset.iterator();   
	  while(iterator.hasNext())                   
	  {
		  System.out.println(iterator.next());
	  }
	}
}

