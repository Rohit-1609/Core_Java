package com.Afamily;

import com.Bfamily.*;

public class Father
{
	private void ATM()                                     //private method
	 {
		 System.out.println("Father Access private ATM");
	 }
	 void goldchain()                                     //default method
	 {
		 System.out.println("Father access default goldChain");
	 }
	 protected void bike()                               //protected method
	 {
		 System.out.println("Father access protected bike");
	 }
	 public void cycle()                                 //public method
	 {
		 System.out.println("Father access public  bike");
	 }
	 public static void main(String[] args)
	 {
		Father father=new Father();
		father.ATM();
		father.bike();
		father.cycle();
		father.goldchain();
	}

}
