package com.Collections;

import com.sun.deploy.uitoolkit.SynthesizedEventListener;

public class TestThreadBdemo 
{
 public static void main(String[] args) 
 {
	System.out.println("mms");
	ThreadBDemo1 t1 = new ThreadBDemo1(
	Thread t2=new Thread(t1);
	t2.start();
	ThreadAdemo1 t3= new ThreadAdemo1();
	t3.start();
	System.out.println("mme");
}
}
