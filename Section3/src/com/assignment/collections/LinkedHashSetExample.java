package com.corejava.assignment.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
public static void main(String[] args) {
	 LinkedHashSet linkedhashset= new LinkedHashSet();
	 linkedhashset.add(25);
	 linkedhashset.add("java");
	 linkedhashset.add('R');
	 linkedhashset.add(25);
	 linkedhashset.add(null);
	 linkedhashset.add(21);
	 linkedhashset.add(87);
	 linkedhashset.add(66);
	 linkedhashset.add("apple");
	 linkedhashset.add("hello");
	 linkedhashset.add(45);
	 System.out.println("Hashset element are:");
	  
	  Iterator iterator =linkedhashset.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.println(iterator.next());
	  }
}
}
