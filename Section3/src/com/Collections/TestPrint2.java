package com.Collections;

public class TestPrint2
{
 public static void main(String[] args) throws InterruptedException
 {
	
		Print p1= new Print();
		Print p2= new Print();
		Print p3= new Print();
		p1.start();
		p1.join();
		p2.start();
		p2.join();
		p3.start();

}
}
