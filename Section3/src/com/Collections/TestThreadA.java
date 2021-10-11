package com.Collections;

public class TestThreadA 
{
  public static void main(String[] args)
  {
	System.out.println("mms");
	ThreadAdemo1 t = new ThreadAdemo1();
	t.start();
	
	ThreadAdemo1 t2 = new ThreadAdemo1();
	t2.start();
	System.out.println("mme");
	
}
}
