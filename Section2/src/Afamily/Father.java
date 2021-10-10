package Afamily;

public class Father 
{
 private void ATM()
 {
	 System.out.println("Father Access private ATM");
 }
 void goldchain()
 {
	 System.out.println("Father access default goldChain");
 }
 protected void bike()
 {
	 System.out.println("Father access protected bike");
 }
 public void cycle()
 {
	 System.out.println("Father access protected bike");
 }
 public static void main(String[] args) {
	Father f=new Father();
	f.ATM();
	f.bike();
	f.cycle();
	f.goldchain();
}
}
