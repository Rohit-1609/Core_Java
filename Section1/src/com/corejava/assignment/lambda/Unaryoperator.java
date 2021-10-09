package com.corejava.assignment.lambda;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Unaryoperator {

	public static void main(String[] args)
	{
		
		 UnaryOperator<Integer> unaryOpertor = ( t ) -> 2 * t;
		 
		   Stream<Integer> stream = Stream.iterate(1, unaryOpertor).limit(5);
		   stream.forEach(System.out::println);
          System.out.println("--------------------------");
          
          UnaryOperator<Integer> unaryOpertor1 = ( t ) -> { return 2 * t * t; };
          
          // apply method Example
          int output = unaryOpertor1.apply(2);
          System.out.println(output);
        
          // identity method Example
          UnaryOperator<Integer> unaryOperator2 = UnaryOperator.identity();
          int output2 = unaryOperator2.apply(2); 
          System.out.println(output2); 
	}

}
