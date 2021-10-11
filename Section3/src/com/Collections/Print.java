package com.Collections;

public class Print extends Thread
{
   @Override
   public void run()
   {
	   String s= Thread.currentThread().getName();
	   System.out.println(s);
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println(i);
		   try {
			Thread.sleep(1500);
		} 
		   catch (InterruptedException e)
		   {
			System.out.println("IException Handled");
			e.printStackTrace();
		}
	   }
   }
}
