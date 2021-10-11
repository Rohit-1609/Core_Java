package com.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemo1 
{
 public static void main(String[] args) 
 {
	 TreeSet h= new TreeSet();
	  h.add(25);
	  h.add("vivo");
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
	  
	  System.out.println("------------------------");
	  Iterator it1 =h.descendingIterator();
	  while(it1.hasNext())
	  {
		  System.out.println(it1.next());
	  }
	  
}
}
