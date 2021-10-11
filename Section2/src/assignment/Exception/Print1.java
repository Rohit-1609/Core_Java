package com.corejava.assignment.Exception;

public class Print1 
{
  public static void main(String[] args) 
  {
	  System.out.println("Main method started");
	  for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} 
			
			catch (InterruptedException e) 
			{
				
			System.out.println("Interrupted exception Handled");
			}
		}
	  System.out.println("Main method ended");
}
}
