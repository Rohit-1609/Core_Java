package com.corejava.assignment.lambda;

import java.util.function.BinaryOperator;

public class BinaryOperator2 
{
public static void main(String[] args)
{
    BinaryOperator<Integer>
    binaryoperator4 = BinaryOperator
             .maxBy(
                 (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

     System.out.println(binaryoperator4.apply(98, 11));
     System.out.println("------------------------------------------");
     BinaryOperator<Integer>
     binaryopearator5 = BinaryOperator
              .minBy(
                  (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

       System.out.println(binaryopearator5.apply(98, 11));
}
}
