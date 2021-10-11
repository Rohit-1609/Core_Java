package com.corejava3;
import java.lang.*;

public class CustomExcep extends RuntimeException
{
  @Override
  public String getMessage()
  {
	  return "Bad mock Rating";
  }
  
}
