package com.projectUser.Model;

public class LoginDetails {

	private String username;
	private String pass;
	
	
	public LoginDetails() {
		super();
	 }
	public LoginDetails(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
