package com.masai.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.masai.entities.Customer;
import com.masai.entities.Product;
import com.masai.entities.Transaction;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;
import com.masai.exceptions.TransactionException;

import com.masai.entities.Customer;
import com.masai.exceptions.DuplicateDataException;

public interface CustomerService {
	public void signUp(Customer cus, Map<String, Customer> customers) throws DuplicateDataException;
}
