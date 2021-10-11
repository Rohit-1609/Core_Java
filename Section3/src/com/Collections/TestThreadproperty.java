package com.Collections;

public class TestThreadproperty extends Thread
{
 public static void main(String[] args) 
 {
	ThreadSample2 d=new ThreadSample2();
	System.out.println(d);
	System.out.println("Id :" +d.getId());
	System.out.println("---------------------------------");
	System.out.println("Name :"+d.getName());
	d.setName("Gate-1");
	System.out.println(d.getName());
	System.out.println("-----------------------------------");
	System.out.println("priority :"+d.getPriority());
	d.setPriority(MIN_PRIORITY);
	System.out.println("priority :"+d.getPriority());
	System.out.println("-----------------------------------");
	System.out.println("State :"+d.getState());
	System.out.println("----------------------------------");
	System.out.println("Isdaemon :"+d.isDaemon());
	System.out.println("--------------------------------");
	System.out.println("Isalive :"+d.isAlive());
}
}
