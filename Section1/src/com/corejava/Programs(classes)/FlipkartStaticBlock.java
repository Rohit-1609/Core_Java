package com.corejava;

public class FlipkartStaticBlock
{
  static String Laptop;
  static double Price;
  static
  {
	  System.out.println("Running Flipkart");
      Laptop="hp";
      Price =35000;
  }
      static void detail() 
      {
    	System.out.println("LAptop name is= "+Laptop);  
    	System.out.println("Laptop price is= "+Price);
      }
      
  
  
}
