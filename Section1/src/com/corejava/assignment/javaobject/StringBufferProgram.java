package com.corejava.assignment.javaobject;

public class StringBufferProgram {

	public static void main(String[] args) 
	{
		StringBuffer stringbuffer1= new StringBuffer();              //Creating objects of StringBuffer
		  System.out.println(stringbuffer1.capacity());                //checking capacity of stringBuffer
		  stringbuffer1.ensureCapacity(20);                            //changing capacity of stringBuffer
		  System.out.println(stringbuffer1.capacity());

		  
		  StringBuffer stringbuffer2=new StringBuffer("Hello");
		  System.out.println(stringbuffer2);
		  stringbuffer2.replace(2, 4,"LL");                             //replace the substring using stringBuffer class predefine method
		  System.out.println(stringbuffer2);
		  stringbuffer2.delete(2, 4);                                  // delete the substring
		  System.out.println(stringbuffer2);
		  
		  StringBuffer stringbuffer3=new StringBuffer("Java");
		  System.out.println(stringbuffer3);
		  stringbuffer3.append("Script");                                //Append the substring
		  System.out.println(stringbuffer3);
		  
		  StringBuffer stringbuffer4=new StringBuffer("Goods");
		  System.out.println(stringbuffer4);
		  stringbuffer4.insert(5, "Bye");                              //insert substring in string
		  System.out.println(stringbuffer4);
		  
		  StringBuilder stringbuffer5= new StringBuilder("Angular");
		  System.out.println(stringbuffer5);
		  stringbuffer5.reverse();                                     //reverse String
		  System.out.println(stringbuffer5);
	}

}
