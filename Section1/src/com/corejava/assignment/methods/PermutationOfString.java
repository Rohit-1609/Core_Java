package com.corejava.assignment.methods;

import java.util.Scanner;

public class PermutationOfString 
{
	  /*this method perform operation 
     * of finding different possible permutation of string 
     */
	void permute(String string1, int first, int last)
	{
		if(first==last)
			System.out.println(string1);
		else
		{
			for(int i=first;i<=last;i++)
			{
				string1 = swap(string1,first,i);
				permute(string1, first+1,last);
				string1= swap(string1, first, i);
			}
		}
	}
	  /*this method perform operation 
     * of Swapping two number
     */
	String swap(String string2, int i,int j)
	{
		char temp; 
		char []character = string2.toCharArray();
		temp = character[i];
		character[i]= character[j];
		character[j]= temp;
		return string2.valueOf(character);
	}
	
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		String string=scanner.next();
		int length = string.length();
		PermutationOfString permutationofstring= new PermutationOfString();
		permutationofstring.permute(string, 0, length-1);
		
	}
}
