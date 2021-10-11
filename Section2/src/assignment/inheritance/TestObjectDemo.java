package com.corejava.assignment.inheritance;

public class TestObjectDemo 
{
  public static void main(String[] args)
  {
	  Sample4 sample4 =new Sample4();
	  System.out.println(sample4);
	  System.out.println(sample4.toString());
	  ObjectClassDemo1 objectclass1= new ObjectClassDemo1();
	  System.out.println(objectclass1);
	  System.out.println(objectclass1.toString());
	  System.out.println("-------------------------");
	  ObjectClassDemo1 objectclass2= new ObjectClassDemo1();
	  System.out.println(objectclass2);
	  System.out.println(objectclass2.hashcode());
	  System.out.println("-------------------------");
	  ObjectClassDemo1 objectclass3= new ObjectClassDemo1();
	  ObjectClassDemo1 objectclass4=objectclass3;
	  ObjectClassDemo1 objectclass5=objectclass4;
	  System.out.println(objectclass5);
	  System.out.println(objectclass5.getClass());
	  System.out.println("---------------------------");
	  String string1= "Pune";
	  String string2 = new String("Pune");
	  String string3 = "Pune";
	  String string4 = new String("Pune");
	  System.out.println(string1.equals(string2));
	  System.out.println(string1.equals(string3));
	  System.out.println(string1.equals(string4));
	  System.out.println(string2.equals(string4));
	  
	  
	  
  }
}
