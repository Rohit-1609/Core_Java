package com.corejava.assignment.lambda;

import java.util.function.LongFunction;

public class PrimitiveLongFunction 
{
 public static void main(String[] args) 
 {
	  // lambda expression for LongFunction to check number is positive or negative
       LongFunction<Boolean> lf = longNum ->  longNum >= 0;

     // testing for different numbers using above lambda expression
     System.out.println("1. Whether 36837638638 is postive number : "+ lf.apply(36837638638l));
     
     System.out.println("2. Whether -43233323283 is postive number : "+ lf.apply(-43233323283l));

     System.out.println("3. Whether 9037328763630  is postive number : " + lf.apply( 9037328763630l));

     System.out.println("4. Whether -37382680333432 is postive number : " + lf.apply(-37382680333432l));

     System.out.println("5. Whether 47363 is postive number : "+ lf.apply(47363l));
}
}
