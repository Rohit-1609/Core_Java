package com.corejava.assignment.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{
  public static void main(String[] args) {
	  LinkedHashMap<Integer,String>  linkedhashmap= new LinkedHashMap<Integer,String>();
		linkedhashmap.put(85, "Hi");
		linkedhashmap.put(85, "Hello");
		linkedhashmap.put(11, "Rohit");
		linkedhashmap.put(12, "Rohit");
		linkedhashmap.put(21, "bye");
		linkedhashmap.put(18, "Oye");
		linkedhashmap.put(17, "Sql");
		System.out.println(linkedhashmap.get(11));
		System.out.println(linkedhashmap.containsKey(11));
		System.out.println(linkedhashmap.containsValue("Hello"));
		System.out.println("------------------------------------");
		System.out.println("Hashmap element are:");
		for(Map.Entry entry :linkedhashmap.entrySet())
		{
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
}
}
