package com.corejava2;

public class SingletonCalculator
{
 static SingletonCalculator c;
 static int count=0;
 int a=10;
 int b=20;
 private SingletonCalculator()
 {
	 System.out.println("Running private const");
	 count++;
 }
 void add()
 {
	 System.out.println(a+b);
 }
 static SingletonCalculator getsingletonCalculator()
 {
	 if(count==0)
	 {
		 c=new SingletonCalculator();
		 
	 }
	 System.out.println(" c : "+c);
	 return c;
	 
 }
}
