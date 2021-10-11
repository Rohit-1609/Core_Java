package com.corejava;

public class ConstOverloading 
{
int pages;
double price;
public ConstOverloading()
{
	System.out.println("Running Zero-arg Constructor");
	pages=100;
	price=80.35;
}
 public ConstOverloading(int pages,double price)
{
	System.out.println("Running arg constructor");
	this.pages=pages;
	this.price=price;
}
 void details()
 {
	 System.out.println("pages is: "+pages);
	 System.out.println("price is: "+price);
 }
}
