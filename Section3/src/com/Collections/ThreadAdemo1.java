package com.Collections;
import java.lang.Thread;
public class ThreadAdemo1 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
	System.out.println(i);
	try {
		Thread.sleep(1500);
	}
	catch (InterruptedException e) 
	{
		System.out.println("Interupted exception handled");
		e.printStackTrace();
	}

}

}
}
