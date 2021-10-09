package com.corejava.assignment.methods;

public class TestAccount {

	public static void main(String[] args)
	{
	  Account customer1= new Account();
	  customer1.balance();
	  customer1.deposit(5000);
	  customer1.balance();
	  customer1.withdraw(1000);
	  customer1.balance();
	  Account customer2 = new Account();
	  customer2.deposit(10000);
	  customer2.balance();
	  customer2.withdraw(2000);
	  customer2.balance();
	  Account.bankbalance();
	  
	  

	}

}
