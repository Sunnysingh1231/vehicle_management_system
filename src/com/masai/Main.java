package com.masai;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.masai.entities.Passenger;
import com.masai.entities.vehicleDet;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;
import com.masai.service.PassengersService;
import com.masai.service.PassengersServiceImplement;
import com.masai.service.contService;
import com.masai.service.contServiceImplement;
import com.masai.utility.FileExists;

public class Main {
	
//	*************-customereSignup-*****************
	
	public static void PasengerSignup(Scanner sc, Map<String, Passenger> passengers) throws DuplicateDataException {
		System.out.println("please enter the following details to Signup");
		System.out.println("please enter your name");
		String name = sc.next();
		
		System.out.println("Enter your mobile number here");
		int mobNum = sc.nextInt();
		
		System.out.println("Enter the email id");
		String email = sc.next();
		
		System.out.println("enter the password");
		String password = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the balance that you want to add in your wallet");
		double balance = sc.nextDouble();
		
		Passenger cus = new Passenger(name, mobNum, email,password,balance);

		PassengersService cusService = new PassengersServiceImplement();
		cusService.signUp(cus, passengers);
		System.out.println("sign up Succefully");
		System.out.println();

	}
	
//	*************-customerSignin-*******************
	
	
	
	
	
	private static void adminContFunc(Scanner sc, Map<Integer, vehicleDet> vehicleDets, Map<String, Passenger> passengers)
			throws InvalidDetailsException, ProductException, TransactionException {

		adminLogin(sc);

		contService prodService = new contServiceImplement();
		PassengersService cusService = new PassengersServiceImplement();
//		TransactionService trnsactionService = new TransactionServiceImpl();
		int choice = 0;
		try {
			do {
				System.out.println("Press 1 add new vehicle details");
				System.out.println("Press 2 view all the vehicle");
				System.out.println("Press 3 delete the vehicle details");
				System.out.println("Press 4 view all Passenger");
				System.out.println("Press 9 to log out");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					String added = adminAddvehicledetails(sc, vehicleDets, prodService);
					System.out.println(added);
					break;
				case 2:

					adminViewAllDetails(vehicleDets, prodService);
					break;
				case 3:

					adminDeleteDetails(sc, vehicleDets, prodService);
					break;

				case 4:
					adminViewAllCustomers(passengers, cusService);
					break;
				case 9:
					System.out.println("admin has successfully logout");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}

			} while (choice <= 6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
//	********************-add vehicle details-**********************
	
	public static String adminAddvehicledetails(Scanner sc, Map<Integer, vehicleDet> vehicleDets, contService prodService) {

		String str = null;
		System.out.println("please enter the vehicle details");
		System.out.println("Enter the vehicle name");
		String name = sc.next();
		System.out.println("Enter the vehicle number");
		int vehicleNumber = sc.nextInt();
		System.out.println("Enter the vehicle registration number");
		int vehicleReNumber = sc.nextInt();
		System.out.println("Enter the vehicle type");
		String vehicleType = sc.next();

		vehicleDet prod = new vehicleDet(newIDGeneration.generateId(), name, vehicleNumber, vehicleReNumber, vehicleType);

		str = prodService.addProduct(prod, vehicleDets);// considering all details are valid

		return str;

	}
	
	public class newIDGeneration {

		public static int generateId() {

			return (int) (Math.random() * 10000);
		}

	}
	
//	********************-view vehicle details-**********************
	
	public static void adminViewAllDetails(Map<Integer, vehicleDet> vehicleDets, contService prodService)
			throws ProductException {
		prodService.viewAllProducts(vehicleDets);
	}
	
	
//	********************-delete vehicle details-**********************
	
	public static void adminDeleteDetails(Scanner sc, Map<Integer, vehicleDet> vehicleDets, contService prodService)
			throws ProductException {

		System.out.println("please enter the id of product to be deleted");
		int id = sc.nextInt();
		prodService.deleteProduct(id, vehicleDets);
	}
	
	
	
//	********************-view all Passenger-**********************
	
	public static void adminViewAllCustomers(Map<String, Passenger> passengers, PassengersService cusService)
			throws ProductException {
		List<Passenger> list = cusService.viewAllCustomers(passengers);

		for (Passenger c : list) {
			System.out.println(c);
		}
	}
	
	
	
//	*******************-adminlogin-*********************
	
	public static void adminLogin(Scanner sc) throws InvalidDetailsException {

		System.out.println("Enter the user name");
		String userName = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if (userName.equals("admin") && password.equals("1234")) {

			System.out.println("successfully login");
		} else {
			throw new InvalidDetailsException("Invalid Admin Credentials");
		}
	}
	
//	****************************************************************************************
	
	public static void main(String[] args) {
		
		Map<String, Passenger> passengers = FileExists.customerFile();
		Map<Integer, vehicleDet> vehicleDets = FileExists.productFile();
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome in RideOn");
		System.out.println("'become a rider'");
		System.out.println();

		try {

			int preference = 0;
			do {
				System.out.println("Please enter your preference");
				System.out.println("1 => Admin login");
				System.out.println("2 => Passenger signup");
				preference = sc.nextInt();
				switch (preference) {
				case 1:
					adminContFunc(sc, vehicleDets, passengers);
					break;
				

				case 2:
					PasengerSignup(sc, passengers);
					break;
					
				default:
					throw new IllegalArgumentException("Invalid Selection");
				}

			}

			while (preference != 0);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} 
		
		
	}
}
