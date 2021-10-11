package com.corejava3;

import java.util.Arrays;

public class Arraysorting
{
 public static void main(String[] args) {
	int a[]= {23,76,11,89,45,33,12,67,43,55,19};
	System.out.println("Before Sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("----------------------------------");
	Arrays.sort(a);
	System.out.println("After sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("--------------------------------------");
	for(int i=a.length-1;i>=0;i--) 
	{
		System.out.println(a[i]);
		
	}
}
}
