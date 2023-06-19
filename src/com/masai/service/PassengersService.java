package com.masai.service;

import java.util.List;
import java.util.Map;

import com.masai.entities.Passenger;
import com.masai.entities.vehicleDet;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;

public interface PassengersService {
	public boolean login(String email,String password, Map<String, Passenger> passengers) throws InvalidDetailsException;

	public void signUp(Passenger cus, Map<String, Passenger> passengers) throws DuplicateDataException;

	public Passenger viewCustomerDetails(String email, Map<String, Passenger> passengers);

	public List<Passenger> viewAllCustomers(Map<String, Passenger> passengers) throws ProductException;
}
