package com.communion.registration.model;


import java.lang.String;
//why serializable?
public class User {


		private int id;
		//  private static final long serialVersionUID = 1 L;
	    private String firstName;
	    private String lastName;
	    private String userName;
	    private String password;
	    private String role;
	    
	    public User(int id, String firstName, String lastName, String userName, String password, String role) {
			// TODO Auto-generated constructor stub
	    	this.setId(id);
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.userName = userName;
	    	this.password = password;
	    	this.role = role;
		}
	    
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getUsername() {
	        return userName;
	    }
	    public void setUsername(String userName) {
	        this.userName = userName;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + userName + ", role=" + role +  "]";
		}

}
