package com.corejava.assignment.threads;

public class TestThreadLifeCycle 
{
public static void main(String[] args) {
	
	ThreadSample2 threadsample1=new ThreadSample2();
	ThreadSample2 threadsample2=new ThreadSample2();
	ThreadSample2 threadsample3=new ThreadSample2();
	
	System.out.println(threadsample1.getName()+ " : " +threadsample1.getState());
	System.out.println(threadsample2.getName()+ " : " +threadsample2.getState());
	System.out.println(threadsample3.getName()+ " : " +threadsample3.getState());
	threadsample1.start();
	
	System.out.println(threadsample1.getName()+ " : " +threadsample1.getState());
	System.out.println(threadsample2.getName()+ " : " +threadsample2.getState());
	System.out.println(threadsample3.getName()+ " : " +threadsample3.getState());
	threadsample2.start();
	
	System.out.println(threadsample1.getName()+ " : " +threadsample1.getState());
	System.out.println(threadsample2.getName()+ " : " +threadsample2.getState());
	System.out.println(threadsample3.getName()+ " : " +threadsample3.getState());
	threadsample3.start();
	
	System.out.println(threadsample1.getName()+ " : " +threadsample1.getState());
	System.out.println(threadsample2.getName()+ " : " +threadsample2.getState());
	System.out.println(threadsample3.getName()+ " : " +threadsample3.getState());
//	d1.start();
//	d1.stop();
}
}
