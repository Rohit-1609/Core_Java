package com.corejava.assignment.lambda;

import java.util.function.DoublePredicate;

public class DoublePredicateExample 
{
 public static void main(String[] args) 
 {
	  DoublePredicate dp = d ->  d >= 6.7;
	  
      // testing for different numbers using above lambda expression
      System.out.println("1. Whether Amol passed with CGPA of 9.2 : " + dp.test(6.9));
      System.out.println("2. Whether Pranay passed with CGPA of 4.3 : "+ dp.test(8.8));
      System.out.println("3. Whether Rahul passed with CGPA of 7.9 : "  + dp.test(7.5));
      System.out.println("4. Whether Shubhum passed with CGPA of 5.4 : " + dp.test(5.9));
      System.out.println("5. Whether Akshay passed with CGPA of 6.8 : " + dp.test(8.1));
}
}
