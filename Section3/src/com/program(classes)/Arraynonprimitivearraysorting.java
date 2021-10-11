package com.corejava3;

import java.util.Arrays;

public class Arraynonprimitivearraysorting
{
	public static void main(String[] args) {
  Nonprimitivearraysorting n[]= new Nonprimitivearraysorting[5];
  n[0]= new Nonprimitivearraysorting("Moto", 10000);
  n[1]=new Nonprimitivearraysorting("Apple", 70000);
  n[2]=new Nonprimitivearraysorting("Oppo", 15000);
  n[3]= new Nonprimitivearraysorting("Vivo", 18000);
  n[4]= new Nonprimitivearraysorting("Redmi MI", 25000.5);
  
  System.out.println("Mobile info :");
  System.out.println("---------------------------------");
  System.out.println("Brand  \t  Price");
  System.out.println("-------------------------------------");
  for(int i=0;i<n.length;i++)
  {
	  System.out.println(n[i]);
  }
  System.out.println("**************************************");
  
  Arrays.sort(n);
  System.out.println("mobile info sort by price");
  for(int i=0;i<n.length;i++)
  {
	  System.out.println(n[i]);
  }
  System.out.println("****************************************");
  Sortbyname s=new Sortbyname();
  Arrays.sort(n,s);
  System.out.println("Mobile info sorted by brand");
  for(int i=0;i<n.length;i++)
  {
	  System.out.println(n[i]);
  }
  
}
}