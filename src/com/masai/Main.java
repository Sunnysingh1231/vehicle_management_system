package com.masai;

import java.util.*;

public class Main {
	
	public static void customerSignup(Scanner input  ) {
		System.out.println("please enter the following details to Signup");
		System.out.println();
		System.out.println("Enter your name");
		String name=input.next();
		
		System.out.println("enter your mobile number");
		int mobNumber = input.nextInt();
		
		System.out.println("Enter the email id");
		String email = input.next();
		
		System.out.println("Enter the password");
		String passwor = input.next();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome in RideOn");
		System.out.println("'become a rider'");
		System.out.println();
		System.out.println("Please enter your preference" );
		System.out.println("2 => Customer signup");
		
		int signup=input.nextInt();
		

		switch (signup) {
		case 2: {
			
			customerSignup(input);
			break;
		}
		default:
			throw new IllegalArgumentException("Invalid Selection:" + signup+"Please select a valid number");
		}
	}
}
