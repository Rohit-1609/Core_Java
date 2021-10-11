package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 
{
  public static void main(String[] args)
  {
	
HashMap<Integer,String>  hm= new HashMap<Integer,String>();
	hm.put(85, "Hi");
	hm.put(85, "Hello");
	hm.put(11, "Rohit");
	hm.put(12, "Rohit");
	hm.put(21, "bye");
	hm.put(18, "Oye");
	hm.put(17, "Sql");
	System.out.println(hm.get(11));
	System.out.println(hm.containsKey(11));
	System.out.println(hm.containsValue("Hello"));
	System.out.println("------------------------------------");
	System.out.println("Hashmap element are:");
	for(Map.Entry e :hm.entrySet())
	{
		System.out.println(e.getKey()+ " " + e.getValue());
	}
}
}