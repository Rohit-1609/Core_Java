package com.corejava2;

public class Accessingprivatemethod 
{
  private void test()
  {
	  System.out.println("Running private method");
  }
  
  public void gettest()
  {
	  test();
  }
  private void test(int a)
  {
	  System.out.println("Running private arg method");
  }
  public void gettest1(int a)
  {
	  test(a);
  }
}
