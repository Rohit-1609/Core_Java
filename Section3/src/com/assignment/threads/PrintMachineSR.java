package com.corejava.assignment.threads;

public class PrintMachineSR extends Thread
{
	Printer printer;
	
	PrintMachineSR(Printer printer)
	{
		this.printer=printer;
	}
	
	@Override
	public void run()
	{
		printer.print();
	}
}
