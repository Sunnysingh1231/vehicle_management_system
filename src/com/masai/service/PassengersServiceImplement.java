package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.masai.entities.Passenger;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;

public class PassengersServiceImplement implements PassengersService{
	@Override
	public void signUp(Passenger cus, Map<String, Passenger> passengers) throws DuplicateDataException {

		if (passengers.containsKey(cus.getEmail())) {
			throw new DuplicateDataException("Passenger already exists , please login");
		} else {

			passengers.put(cus.getEmail(), cus);

		}

	}

	@Override
	public boolean login(String email,String password, Map<String, Passenger> passengers) throws InvalidDetailsException {

		if (passengers.containsKey(email) ) {
			
			if(passengers.get(email).getPassword().equals(password)) {
				return true;
			}
			else {
				throw new InvalidDetailsException("Invalid Credentials");
			}
			
		} else {
			throw new InvalidDetailsException("you have not sign up yet, please signup");
		}

	}


	@Override
	public Passenger viewCustomerDetails(String email, Map<String, Passenger> passengers) {

		if (passengers.containsKey(email)) {

			return passengers.get(email);

		}

		return null;
	}

	@Override
	public List<Passenger> viewAllCustomers(Map<String, Passenger> passengers) throws ProductException {
		// TODO Auto-generated method stub
		List<Passenger> list = null;

		if (passengers != null && passengers.size() > 0) {
			Collection<Passenger> coll = passengers.values();
			list = new ArrayList<>(coll);
		} else {
			throw new ProductException("Passenger list is empty");
		}

		return list;
	}
}
