package com.Collections;

import java.util.LinkedList;

public class LLDemo 
{
 public static void main(String[] args)
  {
	 LinkedList l1= new LinkedList();
	 l1.add(10);
	 l1.add(null);
	 l1.add('A');
	 l1.add(10);
	 l1.add("java");
	 System.out.println(l1);
	 System.out.println("---------------------------");
	 l1.addFirst("Started");
	 l1.addLast("ended");
	 
	 System.out.println(l1);
	 System.out.println("----------------------------");
	 l1.offerFirst("0000");
	 l1.offerLast("1111");
	 System.out.println(l1);
}
}
