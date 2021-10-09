package com.corejava.assignment.lambda;

import java.util.function.DoubleFunction;

public class PrimitiveDoubleFunction
{
public static void main(String[] args) 
{
	DoubleFunction<String> df = d -> "you have cleared IIT-JEE with " + d + " CGPA";
	 
    // testing for different numbers using above lambda expression
    System.out.println("Mohit, " + df.apply(7.0));

    System.out.println("Aakash, " + df.apply(7.9));

    System.out.println("kuldip, " + df.apply(8.5));

    System.out.println("suraj, " + df.apply(6.5));

    System.out.println("gaurav, " + df.apply(9.4));
}
}
