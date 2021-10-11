package com.corejava.assignment.threads;

public class ThreadSample2 extends Thread
{
	@Override
	 public void run()
	 {
		 System.out.println("Running Run method...");
		 
		 System.out.println("---------------------------");
		 Thread t=Thread.currentThread();
		 System.out.println(t);
		 
		 String s=Thread.currentThread().getName();
		 System.out.println(s);
		}
}
