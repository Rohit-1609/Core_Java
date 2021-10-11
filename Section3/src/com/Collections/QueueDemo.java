package com.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo
{
  public static void main(String[] args) 
  {
	PriorityQueue p =new PriorityQueue();
	p.add(20);
	p.add(87);
	p.add(44);
	p.add(32);
	p.add(90);
	p.add(18);
	System.out.println("Priority elements are:");
	  Iterator it =p.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  System.out.println("--------------------------------");
	  System.out.println(p.peek());
	  p.poll();
	  System.out.println("----------------------------------");
	  System.out.println(p);
	  System.out.println("-------------------------------------");
	  System.out.println(p.peek());
	  p.poll();
	  System.out.println("-----------------------------------");
	  System.out.println(p);
}
}
