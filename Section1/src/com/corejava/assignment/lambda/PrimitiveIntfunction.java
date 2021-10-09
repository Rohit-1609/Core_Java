package com.corejava.assignment.lambda;

import java.util.function.IntFunction;

public class PrimitiveIntfunction 
{
public static void main(String[] args)
{
	  // lambda expression to find square of number using IntFunction FI
      IntFunction<Integer> f = i -> i*i;

     // computing Square of an Integer using IntFunction FI
    System.out.println("1. The Square of number 3 is \t: "+ f.apply(3));

    System.out.println("2. The Square of number 9 is \t: " + f.apply(9));

    System.out.println("3. The Square of number 19 is \t: " + f.apply(19));

    System.out.println("4. The Square of number 25 is \t: "  + f.apply(25));

    System.out.println("5. The Square of number 37 is \t: " + f.apply(37));	
	
}
}
