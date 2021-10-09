package com.corejava.assignment.javaobject;

import java.util.Scanner;

public class MethodsInStringClass
{

	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter the String:-");
		String string1=scanner.nextLine();
		//String string1="MAHARASHTRA";
		System.out.println(string1);
		System.out.println(string1.isEmpty());
		System.out.println(string1.length());
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		System.out.println(string1.startsWith("MAHA"));
		System.out.println(string1.endsWith("MAHA"));
		System.out.println(string1.charAt(5));
		System.out.println(string1.indexOf('a'));
		System.out.println(string1.lastIndexOf('a'));
		System.out.println(string1.substring(4));
		System.out.println(string1.substring(4, 8));
		System.out.println(string1.replace("MAHA", "Raha"));
		System.out.println(string1.subSequence(4, 8));
		System.out.println(string1.contains("MAHA"));
		
		String string2="pune";
		System.out.println(string1.concat(string2));
		
		int number=10;
		System.out.println(number);
		String string3=String.valueOf(number);
		System.out.println(string3);
		String string4="PUNE";
		String string5="pune";
		System.out.println(string4.equals(string5));
		System.out.println(string4.equalsIgnoreCase(string5));
		String string6="Pune-Maharashtra-India";
		System.out.println(string6);
		for(String string7:string6.split("-"))
		{
			System.out.println(string7);
		}
		String string8="India";
		System.out.println(string8);
		char character[]=string8.toCharArray();
		character[2]='D';
		character[4]='A';
		for(char a1:character)
		{
			System.out.println(a1);
		}

	}

}
