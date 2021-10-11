package com.corejava3;

import java.util.Scanner;

public class Arrayusingscannerdouble
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter index number of rows and column");
		int m= sc.nextInt();
		int n= sc.nextInt();
		int a[][]= new int[m][n];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			int d=sc.nextInt();
			a[i][j]=d;
			
		}}
		System.out.println("------------------------------");
		System.out.println("Array elements are: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(a[i][j] +" ");	
			}
			System.out.println();
		}

}}
