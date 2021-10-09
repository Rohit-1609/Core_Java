package com.corejava.assignment.lambda;

import java.util.function.LongPredicate;

public class LongPredicateExample 
{
 public static void main(String[] args)
 {
	 LongPredicate lp = longNum ->  longNum >= 0;
	 
     // testing for different numbers using above lambda expression
     System.out.println("1. Whether 15 is postive number : " + lp.test(15454543355l));
     System.out.println("2. Whether -70 is postive number : " + lp.test(-7034545445l));
     System.out.println("3. Whether -30 is postive number : " + lp.test(-30345454543l));
     System.out.println("4. Whether 77 is postive number : " + lp.test(7745345464l));
     System.out.println("5. Whether 50 is postive number : " + lp.test(5034534646l));
}
}
