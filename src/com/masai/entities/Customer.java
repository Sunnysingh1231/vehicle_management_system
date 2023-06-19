package com.masai.entities;

import java.io.Serializable;

public class Customer extends User implements Serializable{
	
//	private double walletBalance;

	public Customer(String name, int mobNum, String email, String password, double balance) {
		super(name, mobNum, email, password,balance);
//		this.walletBalance = walletBalance;
	}

//	public double getWalletBalance() {
//		return walletBalance;
//	}
//
//	public void setWalletBalance(double walletBalance) {
//		this.walletBalance = walletBalance;
//	}

	@Override
	public String toString() {
		return "Passenger [walletBalance="+ getBalance() + ", Name=" + getName() + ", Mobile Number=" + getMobNum() + " ,Email=" + getEmail()
				+ ", Password=" + getPassword() +"]";
	}
}
