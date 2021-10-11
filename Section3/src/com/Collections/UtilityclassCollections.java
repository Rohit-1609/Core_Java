package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class UtilityclassCollections 
{
 public static void main(String[] args)
 {
	  ArrayList al= new ArrayList();
	  al.add(11);
	  al.add(77);
	  al.add(33);
	  al.add(22);
	  al.add(22);
	  al.add(55);
	  al.add(44);
	  al.add(66);
	  al.add(22);
	  System.out.println(al);
	  System.out.println(Collections.max(al));
	  System.out.println(Collections.min(al));
	  System.out.println(Collections.frequency(al,22));
	  System.out.println("----------------------------");
	  Collections.sort(al);
	  System.out.println(al);
	  System.out.println("------------------------------");
	  Collections.reverse(al);
	  System.out.println(al);
	  System.out.println("--------------------------------");
	  Collections.swap(al, 4, 5);
	  System.out.println(al);
	  System.out.println("--------------------------------");
	  Collections.shuffle(al);
	  System.out.println(al);
	  System.out.println("--------------------------------");
	  System.out.println("retriving using Iterator");
	  Iterator it =al.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  
}
}
