package com.corejava.assignment.methods;

import java.util.Scanner;

public class Countvowels {

	  /*this method perform operation 
     * of calculating numbers of vowels in string
     */
	 public static int count_Vowels(String string)
	    {
	        int count = 0;
	        for (int i = 0; i < string.length(); i++)
	        {
	            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
	                    || string.charAt(i) == 'o' || string.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input the string: ");
	        String string = in.nextLine();

	        System.out.print("Number of  Vowels in the string: " + count_Vowels(string)+"\n");
	    }
}
