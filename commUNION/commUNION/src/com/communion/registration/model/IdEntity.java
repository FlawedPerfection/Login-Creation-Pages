package com.communion.registration.model;

public abstract class IdEntity {

	protected int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}