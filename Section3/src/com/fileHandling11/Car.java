package com.fileHandling11;

import java.io.Serializable;

public class Car implements Serializable
{
 String name;
 transient double price;
 
 Car(String name,double price)
 {
	 this.name=name;
	 this.price=price;
 }
 public String toString()
 {
	 return name+ " "+ price;
 }
}
