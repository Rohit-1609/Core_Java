package com.corejava.assignment.oops;

public class TestGadget {

	public static void main(String[] args)
	{
		Mobile mobile=new Gadget();
		mobile.company("oppo");
		mobile.display(6.2);
		mobile.price(16000.5);
		System.out.println("------------------------------------");
		Laptop laptop1 =new Gadget() ;
			
		laptop1.company("HP");
		laptop1.price(35000.0);
		
			
	}

}
