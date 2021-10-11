package com.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 
{
 public static void main(String[] args) 
 {
	Vector v= new Vector();
	System.out.println(v.capacity());
	System.out.println(v.size());
	v.add("Hello");
	v.add('a');
	v.add(10);
	v.add(10);
	v.add(null);
	v.add('a');
	v.add(10);
	v.add("java");
	System.out.println(v.capacity());
	System.out.println(v.size());
	v.add(10);
	v.add(null);
	v.add(10);
	v.add(null);
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println(v);
	
    System.out.println("---------------------------------------");
    Enumeration e= v.elements();
    while(e.hasMoreElements())
    {
    	System.out.println(e.nextElement());
    }
 }
}
