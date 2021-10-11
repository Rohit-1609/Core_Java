package com.corejava.assignment.filehandling;

import java.io.Serializable;

public class Student1 implements Serializable
{
      int id;
      String subject;
      transient double fees;
    public Student1(int id, String subject, double fees)
    {
	super();
	this.id = id;
	this.subject = subject;
	this.fees = fees;
} 
}
