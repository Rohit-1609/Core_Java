package com.Collections;
import java.util.*;
public class PrinterMachineSR extends Thread
{
Printersynchronised p;
public PrinterMachineSR(Printersynchronised p) 
{
	this.p=p;
	
}
@Override
public void run()
{
	p.print();;
}
}
