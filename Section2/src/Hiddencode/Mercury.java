package Hiddencode;

import Usercode.Switch;

public class Mercury implements Switch
{
	@Override
	public void on() {
		System.out.println("mercury bulb turn on");
		
	}

	@Override
	public void off() {
	System.out.println("mercury bulb turn off");
		
	}
}
