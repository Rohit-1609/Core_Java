package com.corejava.assignment.threads;

public class Printer extends Thread
{
  synchronized public void print()
 {
	 Thread threadA=new Thread();
	 String string= threadA.currentThread().getName();
	 System.out.println(string);
	 
	 for(int i=1;i<=5;i++)
	 {
		 try {
			Thread.sleep(1000);
			System.out.println(i);
		} 
		 catch (InterruptedException e) 
		 {
			e.printStackTrace();
		}
		 
		 
	 }
}
}
