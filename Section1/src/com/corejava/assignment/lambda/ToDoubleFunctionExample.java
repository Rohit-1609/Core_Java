package com.corejava.assignment.lambda;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample 
{
  public static void main(String[] args) {
	
	  // lambda expression for ToDoubleFunction FI for subtraction to get double value
	  
      ToDoubleFunction<Integer> df = i -> i - 20;

      // testing for different numbers using above lambda expression
      System.out.println("1. After discount, for 50 is \t= " + df.applyAsDouble(50));

      System.out.println("2. After discount, for 70 is \t= " + df.applyAsDouble(70));

      System.out.println("3. After discount, for 450 is \t= "+ df.applyAsDouble(450));

      System.out.println("4. After discount, for 28 is \t= "+ df.applyAsDouble(28));

      System.out.println("5. After discount, for 47 is \t= "+ df.applyAsDouble(47));
  
}
}
