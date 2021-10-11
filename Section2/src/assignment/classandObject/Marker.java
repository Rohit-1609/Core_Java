package com.corejava.assignment.classandObject;

public class Marker
{
  String Companyname;
  String Color;
  int price;
  double Size;
  
  public Marker()
  {
	  Companyname="camel";
	  Color="Red";
	  price =50;
	  Size=2.5;
  }
  
  public void Write()
  {
	  System.out.println("Marker use for writing");
  }
  
  public void refill()
  {
	  System.out.println("Marker is getting refill");
  }
  public void thrown()
  {
	  System.out.println("throw the marker");
  }
}
