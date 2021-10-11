package com.Collections;

public class TestThreadLifeCycle 
{
 public static void main(String[] args) 
 {
	ThreadSample2 d1=new ThreadSample2();
	ThreadSample2 d2=new ThreadSample2();
	ThreadSample2 d3=new ThreadSample2();
	System.out.println(d1.getName()+ " : " +d1.getState());
	System.out.println(d2.getName()+ " : " +d2.getState());
	System.out.println(d3.getName()+ " : " +d3.getState());
	d1.start();
	System.out.println(d1.getName()+ " : " +d1.getState());
	System.out.println(d2.getName()+ " : " +d2.getState());
	System.out.println(d3.getName()+ " : " +d3.getState());
	d2.start();
	System.out.println(d1.getName()+ " : " +d1.getState());
	System.out.println(d2.getName()+ " : " +d2.getState());
	System.out.println(d3.getName()+ " : " +d3.getState());
	d3.start();
	System.out.println(d1.getName()+ " : " +d1.getState());
	System.out.println(d2.getName()+ " : " +d2.getState());
	System.out.println(d3.getName()+ " : " +d3.getState());
//	d1.start();
//	d1.stop();
	
	
}
}
