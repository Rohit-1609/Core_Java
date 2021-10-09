package com.corejava.assignment.threads;

public class TestPrint2
{
public static void main(String[] args) throws InterruptedException {
	Print printer1= new Print();
	Print printer2= new Print();
	Print printer3= new Print();
	printer1.start();
	printer1.join();
	printer2.start();
	printer2.join();
	printer3.start();

}
}
