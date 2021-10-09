package com.corejava.assignment.classandObject;

import java.util.Scanner;


public class Car
{
	   public void start()
	   {
		   System.out.println("Car has Started");
	   }
	   public void run()
	   {
		   System.out.println("Car is running");
	   }
	   public void stop()
	   {
		   System.out.println("Car has Stoped");
	   }
	   
  public static void main(String[] args) 
	 {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the car brand:");
	   String brand= scanner.nextLine();
	   System.out.println("Enter the car color:");
	   String color= scanner.nextLine();
	   System.out.println("Enter the car price in lakhs:");
	   double price= scanner.nextDouble();
	   System.out.println("Enter the car mileage:");
	   double mileage = scanner.nextDouble();
	  
	
	   System.out.println("Car brand is:-"+brand);
	   System.out.println("Car price is:-"+price);
	   System.out.println("Car color is:-"+color);
	   System.out.println("Car mileage is in kmpl:-"+mileage);
	   Car car= new Car();
	   car.start();
	   car.run();
	   car.stop();

	}
}
