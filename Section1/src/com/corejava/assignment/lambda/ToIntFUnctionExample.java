package com.corejava.assignment.lambda;

import java.util.function.ToIntFunction;

public class ToIntFUnctionExample {

	public static void main(String[] args) 
	{
		  // lambda expression for ToIntFunction FI for multiply to get int value
		 ToIntFunction<Integer> f = i -> i*i;
		 
	        // computing Square of an Integer using Function FI
	        System.out.println("1. The Square of number 25 is \t: " + f.applyAsInt(25));
	 
	        System.out.println("2. The Square of number 7 is \t: "+ f.applyAsInt(7));
	 
	        System.out.println("3. The Square of number 11 is \t: "+ f.applyAsInt(11));
	 
	        System.out.println("4. The Square of number 49 is \t: "+ f.applyAsInt(49));
	 
	        System.out.println("5. The Square of number 6 is \t: " + f.applyAsInt(6));

	}

}
