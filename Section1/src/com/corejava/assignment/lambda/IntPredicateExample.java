package com.corejava.assignment.lambda;

import java.util.function.IntPredicate;

public class IntPredicateExample 
{
  public static void main(String[] args) 
  {
	  IntPredicate ip = i -> i%2 == 0;
	  
      // testing for different numbers using above lambda expression
      System.out.println("1. Whether 130 is even number : " + ip.test(130));

      System.out.println("2. Whether 9 is even number : " + ip.test(9));

      System.out.println("3. Whether 29 is even number : " + ip.test(29));

      System.out.println("4. Whether -88 is even number : " + ip.test(-88));

      System.out.println("5. Whether -41 is even number : " + ip.test(-41));
  
}
}
