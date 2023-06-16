package com.masai.entities;

import java.io.Serializable;

public class Customer extends User implements Serializable {
	public Customer(String name, int mobNumber, String email,String password) {
		super(name, mobNumber, email,password);
		
	}

//	public double getWalletBalance() {
//		return walletBalance;
//	}
//
//	public void setWalletBalance(double walletBalance) {
//		this.walletBalance = walletBalance;
//	}

//	@Override
//	public String toString() {
//		return "Customer [walletBalance=" + walletBalance + ", getWalletBalance()=" + getWalletBalance()
//				+ ", getUsername()=" + getUsername() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
//				+  "]";
//	}
}
