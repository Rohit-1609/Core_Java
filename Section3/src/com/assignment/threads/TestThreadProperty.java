package com.corejava.assignment.threads;

public class TestThreadProperty {

	public static void main(String[] args) 
	{
		ThreadSample2 threadsample2=new ThreadSample2();
		System.out.println(threadsample2);
		System.out.println("Id :" +threadsample2.getId());
		System.out.println("---------------------------------");
		System.out.println("Name :"+threadsample2.getName());
		threadsample2.setName("Gate-1");
		System.out.println(threadsample2.getName());
		System.out.println("-----------------------------------");
		System.out.println("priority :"+threadsample2.getPriority());
		threadsample2.setPriority(10);
		System.out.println("priority :"+threadsample2.getPriority());
		System.out.println("-----------------------------------");
		System.out.println("State :"+threadsample2.getState());
		System.out.println("----------------------------------");
		System.out.println("Isdaemon :"+threadsample2.isDaemon());
		System.out.println("--------------------------------");
		System.out.println("Isalive :"+threadsample2.isAlive());

	}

}
