package com.corejava.assignment.threads;

public class TestThreadX {

	public static void main(String[] args) 
	{
		ThreadX threadx = new ThreadX();
		System.out.println(threadx);
		
		Thread thread1= new Thread(threadx);
        System.out.println(thread1);
        thread1.start();
	}

}
