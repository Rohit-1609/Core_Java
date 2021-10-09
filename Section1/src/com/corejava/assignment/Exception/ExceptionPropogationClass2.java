package com.corejava.assignment.Exception;

public class ExceptionPropogationClass2
{
  public void test2()
  {
	  System.out.println("Excecute test2 method");
	  new ExceptionPropogationClass3().test3();
  }
}
