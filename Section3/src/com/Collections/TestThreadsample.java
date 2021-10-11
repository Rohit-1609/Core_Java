package com.Collections;

public class TestThreadsample 
{
 public static void main(String[] args) 
 {
	 TheadSample t1= new  TheadSample();
	 System.out.println(t1);
	 Thread t2=  new Thread(t1);
	 System.out.println(t2);
	 t2.start();
}
}
