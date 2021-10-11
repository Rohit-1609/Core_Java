package com.corejava3;

public class CarNonprimitivearray 
{
  String name;
  double price;
  public CarNonprimitivearray(String name , double price) {
	this.name=name;
	this.price=price;
}
  
  @Override
  public String toString()
  {
	  return name + " " + price;
  }
}
