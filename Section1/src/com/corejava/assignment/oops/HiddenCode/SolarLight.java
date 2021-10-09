package com.corejava.assignment.oops.HiddenCode;
import com.corejava.assignment.oops.Usercode.Switch;


public class SolarLight implements Switch
{
	
	/*this method is solarlight on() method 
	 *  off() implementation 
	 */
   @Override
  public void on() 
   {
	System.out.println("LED bulb turn on");
	
  }
   @Override
  public void off() {
  System.out.println("LED bulb turn off");
	


}
}
