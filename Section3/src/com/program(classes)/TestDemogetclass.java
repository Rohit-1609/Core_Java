package com.corejava3;

public class TestDemogetclass 
{
 public static void main(String[] args) 
 {
	 Demogetclass d= new Demogetclass();
	 Demogetclass d1;
	 Demogetclass d2;
	 d1=d;
	 d2=d1;
	 System.out.println(d2.getClass());
}
}
