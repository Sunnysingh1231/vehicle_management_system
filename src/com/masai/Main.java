package com.masai;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Customer;
import com.masai.exceptions.DuplicateDataException;
//import com.masai.service.CustomerService;
//import com.masai.service.CustomerServiceImpl;
import com.masai.utility.FileExists;

public class Main {
	
	public static void customerSignup(Scanner sc, Map<String, Customer> customers) throws DuplicateDataException {
		System.out.println("please enter the following details to Signup");
		System.out.println("please enter your name");
		String name = sc.next();
		
		System.out.println("Enter your mobile number here");
		int mobNum = sc.nextInt();
		
		System.out.println("Enter the email id");
		String email = sc.next();
		
		System.out.println("enter the password");
		String password = sc.next();
		
		System.out.println("Enter the balance that you want to add in your wallet");
		double balance = sc.nextDouble();
		
		Customer cus = new Customer(name, mobNum, email,password,balance);

//		CustomerService cusService = new CustomerServiceImpl();
//		cusService.signUp(cus, customers);
		System.out.println("sign up Succefully");

	}
	
	
	
	public static void main(String[] args) {
		
		Map<String, Customer> customers = FileExists.customerFile();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome in RideOn");
		System.out.println("'become a rider'");
		System.out.println();

		try {

			int preference = 0;
			do {
				System.out.println("Please enter your preference");
				System.out.println("3 => Customer signup");
				preference = sc.nextInt();
				switch (preference) {
//				case 1:
//					adminFunctionality(sc, products, customers, transactions);
//					break;
//				case 2:
//					customerFunctionality(sc, customers, products, transactions);
//					break;

				case 3:
					customerSignup(sc, customers);
					break;

//				case 0:
//					System.out.println("successfully existed from the system");
//
//					break;

				default:
					throw new IllegalArgumentException("Invalid Selection");
				}

			}

			while (preference != 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} 
//		finally {
//			// serialization (finally always executed)
//			try {
////				ObjectOutputStream poos = new ObjectOutputStream(new FileOutputStream("Product.ser"));
////				poos.writeObject(products);
//				ObjectOutputStream coos = new ObjectOutputStream(new FileOutputStream("Customer.ser"));
//				coos.writeObject(customers);
//
////				ObjectOutputStream toos = new ObjectOutputStream(new FileOutputStream("Transactions.ser"));
////				toos.writeObject(transactions);
//			//	System.out.println("serialized..........");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(e.getMessage());
//			}
//		}
		
		
	}
}
