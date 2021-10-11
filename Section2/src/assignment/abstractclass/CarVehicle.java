package com.corejava.assignment.abstractclass;

public class CarVehicle implements vehicle2
{

	@Override
	public void start() {
		System.out.println("CarVehicle has started...");
		
	}

	@Override
	public void Stop() {
		System.out.println("CarVehicle has Stopped...");
		
	}

	@Override
	public void run() {
		System.out.println("CarVehicle is running...");
		
	}

}
