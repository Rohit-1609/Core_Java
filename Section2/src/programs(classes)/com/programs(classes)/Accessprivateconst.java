
package com.corejava2;

public class Accessprivateconst 
{
   int a=10;
   private Accessprivateconst()
   {
	   System.out.println("Running accessprivateconst construcctor");
   }
   static Accessprivateconst getaccessprivateconst()
   {
	 Accessprivateconst a= new Accessprivateconst();
	 System.out.println(a);
	 return a;
   }
   
}
