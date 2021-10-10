package Hiddencode;

import Usercode.Switch;

public class LEDbulb implements Switch

{
	@Override
	public void on() {
		System.out.println("LED bulb turn on");
		
	}

	@Override
	public void off() {
	System.out.println("LED bulb turn off");
		
	}
}
