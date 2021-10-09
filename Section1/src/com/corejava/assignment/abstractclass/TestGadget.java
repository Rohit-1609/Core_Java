package com.corejava.assignment.abstractclass;

public class TestGadget
{
  public static void main(String[] args) 
  {
	  Mobile mobile=new Gadget();
		mobile.company("Oneplus");
		mobile.display(6.2);
		mobile.price(30000.5);
		System.out.println(mobile.imei);
		System.out.println("------------------------------------");
		Laptop laptop1 =new Gadget() ;
			
			laptop1.company("Asus");
			laptop1.price(35000.0);
			System.out.println(laptop1.imei);
		
}
}
