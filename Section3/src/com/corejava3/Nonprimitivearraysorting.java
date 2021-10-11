package com.corejava3;
import java.util.*;
public class Nonprimitivearraysorting implements Comparable
{
  String name ;
  double price;
  public Nonprimitivearraysorting(String name , double price)
  {
	  this.name=name;
	  this.price=price;
  }
  @Override
  public String toString()
  {
	  return name + "\t"+ price;
  }
@Override
public int compareTo(Object obj) 
{
	Nonprimitivearraysorting n1=(Nonprimitivearraysorting)obj;
	return (int) (price-n1.price);
}
  
  
}
