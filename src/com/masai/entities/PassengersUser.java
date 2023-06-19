package com.masai.entities;

import java.io.Serializable;

public class PassengersUser implements Serializable{
	private String name;
	private int mobNum;
	private String email;
	private String password;
	private double balance;

	public PassengersUser() {
		super();
	}
	
	

	public PassengersUser(String name, int mobNum, String email, String password,double balance) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
		this.balance=balance;
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



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}

//
//
//	@Override
//	public String toString() {
//		return "Passenger [name=" + name + ", Mobile Number=" + mobNum + ", Password=" + password
//				+ "]";
//	}
}
