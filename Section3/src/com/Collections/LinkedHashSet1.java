package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
 public static void main(String[] args) 
 {
	 LinkedHashSet h= new LinkedHashSet();
	  h.add(25);
	  h.add("java");
	  h.add('R');
	  h.add(25);
	  h.add(null);
	  h.add(21);
	  h.add(87);
	  h.add(66);
	  h.add("apple");
	  h.add("hello");
	  h.add(45);
	  System.out.println("Hashset element are:");
	  Iterator it =h.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
}
}
