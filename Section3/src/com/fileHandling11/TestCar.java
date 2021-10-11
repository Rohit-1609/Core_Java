package com.fileHandling11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestCar
{
 public static void main(String[] args) throws Exception
 {
	Car c1=new Car("Benz",560000);
	System.out.println("c1 :"+c1); 
	System.out.println("Name :"+c1.name);
	System.out.println("Price :"+c1.price);
	System.out.println("--------------------------------------");
	String s1="R:\\Rohit\\Programming\\car.txt";
	FileOutputStream f1= new FileOutputStream(s1);
	ObjectOutputStream oo= new ObjectOutputStream(f1);
	oo.writeObject(c1);
	System.out.println("Serialise object Successfully");
	System.out.println("------------------------------");
	FileInputStream f2=new FileInputStream(s1);
	ObjectInputStream oi=new ObjectInputStream(f2);
    Car c2=(Car)oi.readObject();
    System.out.println("deserialise object successfully");
    System.out.println("c2  :"+c2);
    System.out.println("Name :"+c2.name);
    System.out.println("Price :"+c2.price);
	
}
}
