package com.corejava2;

public class TestDowncast 
{
	public static void main(String[] args) {
 Downcasting1 d= new Downcasting2();
 Downcasting2 d1=(Downcasting2)d;
 d1.register();
 d1.login();
}
}