package com.corejava.assignment.collections;

import java.util.LinkedList;

public class LinkedListExample 
{
public static void main(String[] args) 
{
	 LinkedList linkedlist1= new LinkedList();
	 linkedlist1.add(10);
	 linkedlist1.add(null);
	 linkedlist1.add('A');
	 linkedlist1.add(10);
	 linkedlist1.add("java");
	 linkedlist1.add(20.50);
	 linkedlist1.add(new Employee(1002, "Ramesh", 10500.50));
	 System.out.println(linkedlist1);
	 System.out.println("---------------------------");
	 linkedlist1.addFirst("Started");
	 linkedlist1.addLast("ended");
	 
	 System.out.println(linkedlist1);
	 System.out.println("----------------------------");
	 linkedlist1.offerFirst("0000");
	 linkedlist1.offerLast("1111");
	 System.out.println(linkedlist1);
}
}
