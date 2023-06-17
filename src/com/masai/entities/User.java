package com.masai.entities;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private int mobNum;
	private String email;
	private String password;

	public User() {
		super();
	}
	
	

	public User(String name, int mobNum, String email, String password) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMobNum() {
		return mobNum;
	}



	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



//	@Override
//	public String toString() {
//		return "User [username=" + username + ", password=" + password + ", address=" + address + ", email=" + email
//				+ "]";
//	}
}
