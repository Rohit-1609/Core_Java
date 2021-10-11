package com.corejava2;

public class Sample2inheritence extends Sample1inheritence
{
	{
		System.out.println("Running non static of sample2");
	}
	static
	{
		System.out.println("Running static of sample2");
	}
	public Sample2inheritence() 
	{
		System.out.println("Running sample2 constructor");
	}
	
}
