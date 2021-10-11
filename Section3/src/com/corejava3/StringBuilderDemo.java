package com.corejava3;

public class StringBuilderDemo
{
	public static void main(String[] args) {
  StringBuilder sb1= new StringBuilder();
  System.out.println(sb1.capacity());
  sb1.ensureCapacity(20);
  System.out.println(sb1.capacity());
  
  StringBuilder sb2=new StringBuilder("Hello");
  System.out.println(sb2);
  sb2.replace(2, 4,"LL");
  System.out.println(sb2);
  sb2.delete(2, 4);
  System.out.println(sb2);
  
  StringBuilder sb3=new StringBuilder("Core");
  System.out.println(sb3);
  sb3.append("Java");
  System.out.println(sb3);
  
  StringBuilder sb4 = new StringBuilder("Oye");
  System.out.println(sb4);
  sb4.insert(1, "Bye");
  System.out.println(sb4);
  
  StringBuilder sb5= new StringBuilder("Simba");
  System.out.println(sb5);
  sb5.reverse();
  System.out.println(sb5);
  
  
}
}