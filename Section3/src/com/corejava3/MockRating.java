package com.corejava3;

public class MockRating
{
 void verify(int rating)
 {
	 if(rating<2)
	 {
		 System.out.println("Good.....");
	 }
	 else
	 {
		 throw new CustomExcep();
	 }
	 System.out.println("Contact Hr for Further Process.....");
	 
 }
 
}
