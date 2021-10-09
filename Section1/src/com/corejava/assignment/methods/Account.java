package com.corejava.assignment.methods;

public class Account 
{
   int accountbalance;
   static int bankbalance;
   
   /*this method perform operation 
    * of deposit money 
    */
    void deposit(int amt)
    {
    	System.out.println("Depositing amount" +amt);
        accountbalance= accountbalance+ amt;
        bankbalance=bankbalance+amt;
    }
    /*this method perform operation 
     * of withdraw money 
     */
    void withdraw(int amt)
    {
    	System.out.println("Depositing amount" +amt);
        accountbalance= accountbalance - amt;
        bankbalance=bankbalance - amt;
    }
    /*this method perform operation 
     * of checking account balance 
     */
    void balance()
    {
    	System.out.println("available balance is:"+accountbalance);
      
    }
    /*this method perform operation 
     * of checking bankbalance
     */

   static void bankbalance()
    {
    	System.out.println("available balance is:"+bankbalance);
      
    }
}