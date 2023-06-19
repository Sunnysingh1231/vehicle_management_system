package com.masai.service;

import java.util.Map;

import com.masai.entities.vehicleDet;
import com.masai.exceptions.ProductException;

public interface contService {
	public String addProduct(vehicleDet pro, Map<Integer, vehicleDet> vehicleDets);

	public void viewAllProducts(Map<Integer, vehicleDet> vehicleDets) throws ProductException;

	public void deleteProduct(int id, Map<Integer, vehicleDet> vehicleDets) throws ProductException;

}
