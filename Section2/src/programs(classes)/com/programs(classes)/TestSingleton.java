package com.corejava2;

public class TestSingleton 
{
	public static void main(String[] args) {
	 SingletonCalculator c1= SingletonCalculator.getsingletonCalculator();
  System.out.println(" c1 :"+c1);
  c1.add();
  c1.a=25;
  c1.b=15;
  
  SingletonCalculator c2= SingletonCalculator.getsingletonCalculator();
  System.out.println(" c2 :"+c2);
  
  c2.add();
  
  
  
}
}