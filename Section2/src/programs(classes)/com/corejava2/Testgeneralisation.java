package com.corejava2;

public class Testgeneralisation
{
  public static void main(String[] args) {
	Calculatorgeneralisation c= new Add1();
	c.operation();
	System.out.println("---------------------------");
	Calculatorgeneralisation c1=new Sub1();
	c1.operation();
	System.out.println("------------------------------");
	Calculatorgeneralisation c2=new Mul1();
	c2.operation();
	
}
}
