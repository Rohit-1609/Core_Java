package com.corejava.assignment.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 
{
 public static void main(String[] args)
 {
	 HashMap<Object,Object> hashmap= new HashMap<Object,Object>();
		hashmap.put(85, "Hi");
		hashmap.put(85, "Hello");
		hashmap.put(11, "Rohit");
		hashmap.put(12, "Rohit");
		hashmap.put(21, "bye");
		hashmap.put(18, "Oye");
		hashmap.put(17, "Sql");
		hashmap.put("java", new Employee(2001, "pranay", 20000.50));
		Employee employee1 = new Employee(2002, "Ajay", 22000.50);
		hashmap.put(employee1, "SQL");
		System.out.println(hashmap.get(11));
		System.out.println(hashmap.containsKey(11));
		System.out.println(hashmap.containsValue("Hello"));
		System.out.println("------------------------------------");
		System.out.println(hashmap.get("java"));
		System.out.println(hashmap.get(employee1));
		for(Map.Entry e :hashmap.entrySet())
		{
			System.out.println(e.getKey()+ " " + e.getValue());
		}
}
}
