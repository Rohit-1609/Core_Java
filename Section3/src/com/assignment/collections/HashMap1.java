package com.corejava.assignment.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 
{
public static void main(String[] args) 
	{
		HashMap<Integer,String> hashmap= new HashMap<Integer,String>();
		hashmap.put(85, "Hi");
		hashmap.put(85, "Hello");
		hashmap.put(11, "Rohit");
		hashmap.put(12, "Rohit");
		hashmap.put(21, "bye");
		hashmap.put(18, "Oye");
		hashmap.put(17, "Sql");
		System.out.println(hashmap.get(11));
		System.out.println(hashmap.containsKey(11));
		System.out.println(hashmap.containsValue("Hello"));
		System.out.println("------------------------------------");
		System.out.println("Hashmap element are:");
		for(Map.Entry e :hashmap.entrySet())
		{
			System.out.println(e.getKey()+ " " + e.getValue());
		}

	}
}
