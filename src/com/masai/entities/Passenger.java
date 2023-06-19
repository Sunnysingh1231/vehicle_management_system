package com.masai.entities;

import java.io.Serializable;

public class Passenger extends PassengersUser implements Serializable{
	
	private double walletBalance;

	public Passenger(String name, int mobNumber, String email , String password, double balance) {
		super(name, mobNumber, email, password, balance);
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	@Override
	public String toString() {
		return "Passenger ["+ "Name=" + getName() + ", Mobile Number=" + getMobNum() + " ,Email=" + getEmail()
				+ ", Password=" + getPassword() +"]";
	}
}
