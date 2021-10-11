package com.corejava3;

public class CarDB 
{
  public static void main(String[] args) {
	CarNonprimitivearray []c =new CarNonprimitivearray[5];
	c[0]=new CarNonprimitivearray("swift", 1000000);
	c[1]=new CarNonprimitivearray("audi", 4000000);
	c[2]=new CarNonprimitivearray("benz", 2000000);
	
	System.out.println(c[0]);
	System.out.println(c[0].name + " "+c[0].price);
	
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
	
	System.out.println("-------------------------");
	
	
	
  }
 
}
