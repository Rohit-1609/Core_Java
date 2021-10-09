package com.corejava.assignment.oops;

public class Gmail
{
	private String username;
	private String password;
	 //getter method
	public String getUsername() {
		return username;
	}
	//setter method
	public void setUsername(String username) {
		this.username = username;
	}
	//getter method
	public String getPassword() {
		return password;
	}
	//setter method
	public void setPassword(String password) {
		this.password = password;
	}
	//constructor parameterized
	public Gmail(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Gmail()
	{
		
	}
}
