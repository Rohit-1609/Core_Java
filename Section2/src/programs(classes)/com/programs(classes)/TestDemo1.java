package com.corejava2;

public class TestDemo1
{
 public static void main(String[] args)
 {
	Demo1 d1= new Demo1()
			{
		      @Override 
		      public void test()
		      {
		    	  System.out.println("Running test...");
		      }
			};
	System.out.println(d1);
	d1.test();
	
}
}
