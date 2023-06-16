package com.masai;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Customer;
//import com.masai.entities.Product;
//import com.masai.entities.Transaction;
//import com.masai.exceptions.DuplicateDataException;
//import com.masai.entities.Customer;
//import com.masai.utility.FileExists;
//
//import com.masai.entities.Customer;
//import com.masai.entities.Product;
//import com.masai.entities.Transaction;
//import com.masai.exceptions.DuplicateDataException;
//import com.masai.exceptions.InvalidDetailsException;
//import com.masai.exceptions.ProductException;
//import com.masai.exceptions.TransactionException;
import com.masai.service.CustomerService;
import com.masai.service.CustomerServiceImpl;
//import com.masai.service.ProductService;
//import com.masai.service.ProductServicesImpl;
//import com.masai.service.TransactionService;
//import com.masai.service.TransactionServiceImpl;
//import com.masai.utility.Admin;
//import com.masai.utility.FileExists;
//import com.masai.utility.IDGeneration;

public class Main {
	
	public static void customerSignup(Scanner inp , Map<String, Customer> customers )throws DuplicateDataException {
		System.out.println("please enter the following details to Signup");
		System.out.println();
		
		System.out.println("Enter your name");
		String name=inp.next();
		
		System.out.println("enter your mobile number");
		int mobNumber = inp.nextInt();
		
		System.out.println("Enter the email id");
		String email = inp.next();
		
		System.out.println("Enter the password");
		String password = inp.next();
		
		Customer cus = new Customer(name, mobNumber, email, password);
		
		CustomerService cusService = new CustomerServiceImpl();
		cusService.signUp(cus, customers);
		System.out.println("customer has Succefully sign up");

	}
	
	
	
	
	
	public static void main(String[] args) {
		Map<Integer, Product> products = FileExists.productFile();
		Map<String, Customer> customers = FileExists.customerFile();
		List<Transaction> transactions = FileExists.transactionFile();
		
		Scanner inpdata = new Scanner(System.in);
		
		System.out.println("Welcome in RideOn");
		System.out.println("'become a rider'");
		System.out.println();
		System.out.println("Please enter your preference" );
		System.out.println("2 => Customer signup");
		
		int signup=inpdata.nextInt();
		

		switch (signup) {
		case 2: {
			
			customerSignup(inp customers);
			break;
		}
		default:
			throw new IllegalArgumentException("Invalid Selection:" + signup+" Please select a valid number");
		}
	}
}
