package com.corejava.assignment.classandObject;

public class TestMarker 
{
 public static void main(String[] args)
 {
	 Marker m1 =new Marker();
	 System.out.println(m1.Companyname);
	 System.out.println(m1.Color);
	 System.out.println(m1.price);
	 System.out.println(m1.Size);
	 m1.Write();
	 m1.refill();
	 m1.thrown();
}
}
