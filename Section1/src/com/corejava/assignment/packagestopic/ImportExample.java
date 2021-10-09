package com.corejava.assignment.packagestopic;

import java.util.Scanner;

public class ImportExample {

	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the value of number1:");
		int number1=scanner.nextInt();
		System.out.println("Enter the value of number2:");
		int number2= scanner.nextInt();
		System.out.println("value of greater number from number1 and number2 is:-");
		int greaternumber=(number1> number2)?number1:number2;
		System.out.println("Greater number is:-"+greaternumber);
		

	}

}
