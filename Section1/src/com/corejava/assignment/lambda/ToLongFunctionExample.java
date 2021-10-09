package com.corejava.assignment.lambda;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample
{
  public static void main(String[] args) 
  {
	  // lambda expression for ToLongFunction FI for multiply to get Long value
	  ToLongFunction<Integer> f = i -> i*500000;
	  
      // multiply below number using above ToLongFunction FI
      System.out.println("1. 25 * 500000 = \t" + f.applyAsLong(25));

      System.out.println("2. 11 * 500000 = \t" + f.applyAsLong(11));

      System.out.println("3. 270 * 500000 = \t" + f.applyAsLong(270));

      System.out.println("4. 79 * 500000 = \t" + f.applyAsLong(79));

      System.out.println("5. 22 * 500000 = \t" + f.applyAsLong(22));
}
}
