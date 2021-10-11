package com.corejava3;

import java.util.Scanner;

public class Arrayusingscannersingle 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter index number");
	int size= sc.nextInt();
	int a[]= new int[size];
	System.out.println("Enter" +size+ "elements:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("------------------------------");
	System.out.println("Array elements are: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
