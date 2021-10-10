package Hiddencode;

import Usercode.Switch;

public class CFLbulb implements Switch
{
	@Override
	public void on() {
		System.out.println("CFL bulb turn on");
		
	}

	@Override
	public void off() {
	System.out.println("CFL bulb turn off");
		
	}
}
