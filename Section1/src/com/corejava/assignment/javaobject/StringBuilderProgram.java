package com.corejava.assignment.javaobject;

public class StringBuilderProgram 
{

	public static void main(String[] args) 
	{
		  StringBuilder stringbuilder1= new StringBuilder();              //Creating objects of StringBuilder
		  System.out.println(stringbuilder1.capacity());                //checking capacity of string
		  stringbuilder1.ensureCapacity(20);                            //changing capacity of stringBuilder
		  System.out.println(stringbuilder1.capacity());
		  
		  StringBuilder stringbuilder2=new StringBuilder("Hello");
		  System.out.println(stringbuilder2);
		  stringbuilder2.replace(2, 4,"LL");                             //replace the substring using stringBuilder class predefine method
		  System.out.println(stringbuilder2);
		  stringbuilder2.delete(2, 4);                                  // delete the substring
		  System.out.println(stringbuilder2);
		  
		  StringBuilder stringbuilder3=new StringBuilder("Core");
		  System.out.println(stringbuilder3);
		  stringbuilder3.append("Java");                                //Append the substring
		  System.out.println(stringbuilder3);
		  
		  StringBuilder stringbuilder4 = new StringBuilder("Oye");
		  System.out.println(stringbuilder4);
		  stringbuilder4.insert(1, "Bye");                              //insert substring in string
		  System.out.println(stringbuilder4);
		  
		  StringBuilder stringbuilder5= new StringBuilder("Spring");
		  System.out.println(stringbuilder5);
		  stringbuilder5.reverse();                                     //reverse String
		  System.out.println(stringbuilder5);

	}

}
