package com.Collections;

public class ThreadBDemo1 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
		}
	
			try {
				Thread.sleep(1500);
			} 
			catch (InterruptedException e)
			{
				System.out.println("Exception Handled");
				e.printStackTrace();
			}
	
	}
}
