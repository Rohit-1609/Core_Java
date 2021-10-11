package com.corejava;

public class TestConstOver 
{
 public static void main(String[] args) 
 {
	ConstOverloading c1= new ConstOverloading();
	c1.details();
	System.out.println("-----------------------------");
	ConstOverloading c2 =new ConstOverloading(200,70.30);
	c2.details();
}
}
