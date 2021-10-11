package com.Collections;


public class Printersynchronised extends Thread
{
  synchronized public void print()
  {
	String s= Thread.currentThread().getName() ;
	System.out.println(s);
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
	}
  }
}
