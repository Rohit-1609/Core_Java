package com.corejava.assignment.collections;

import java.util.Stack;

public class StackDemo 
{
 public static void main(String[] args) {
	 Stack stack= new Stack();
	 stack.push(10);
	 stack.push(20);
	 stack.push(30);
	 stack.push(40);
	 stack.push(50);
	 stack.push(60);
	 stack.push(70);
	 stack.push(80);
	 stack.push(null);
	 stack.push(90);
	 stack.push("hello");
	 stack.push(50);
	 stack.push('A');
	 
	 
	 System.out.println( stack);
	 System.out.println( stack.pop());
	 System.out.println( stack);
	 System.out.println( stack.pop());
	 System.out.println( stack);
	 
}
}
