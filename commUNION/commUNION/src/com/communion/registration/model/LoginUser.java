package com.communion.registration.model;

public class LoginUser {
	private String userName;
	private String userPassword;
	
	public LoginUser (String userName, String userPassword) {
	this.userName = userName;
	this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
    
	
}
