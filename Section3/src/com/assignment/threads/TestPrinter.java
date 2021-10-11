package com.corejava.assignment.threads;

public class TestPrinter
{
 public static void main(String[] args) 
 {
 Printer printer=new Printer() ;
 
 PrintMachineSR user1=new PrintMachineSR(printer);
 PrintMachineSR user2=new PrintMachineSR(printer);
 PrintMachineSR user3=new PrintMachineSR(printer);
 user1.start();
 user2.start();
 user3.start();
	
}
}
