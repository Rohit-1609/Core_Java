package com.corejava.assignment.oops;

public class TestWhatsapp {

	public static void main(String[] args)
	{
		Whatsappv1  version1= new	Whatsappv1();
		version1.texting();
		System.out.println("-------------------------------------");
		Whatsappv3 version3=new Whatsappv3();
		version3.texting();
		version3.multimedia();
		version3.calling();
		}
	}

