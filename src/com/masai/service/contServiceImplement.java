package com.masai.service;

import java.util.Map;

import com.masai.entities.vehicleDet;
import com.masai.exceptions.ProductException;

public class contServiceImplement implements contService{
	@Override
	public String addProduct(vehicleDet prod, Map<Integer, vehicleDet> vehicleDets) {
		// TODO Auto-generated method stub
//as our ids are always unique thats why directly putting into products
		vehicleDets.put(prod.getId(), prod);

		return "vehicleDet added successfully";

	}

	@Override
	public void viewAllProducts(Map<Integer, vehicleDet> vehicleDets) throws ProductException {
		// TODO Auto-generated method stub
		if (vehicleDets != null && vehicleDets.size() > 0) {
			for (Map.Entry<Integer, vehicleDet> me : vehicleDets.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new ProductException("vehicleDet List is empty");
		}
	}

	@Override
	public void deleteProduct(int id, Map<Integer, vehicleDet> vehicleDets) throws ProductException {

		// System.out.println(products);
		if (vehicleDets != null && vehicleDets.size() > 0) {

			if (vehicleDets.containsKey(id)) {
				vehicleDets.remove(id);
				System.out.println("product deleted successfully");

			} else {
				throw new ProductException("vehicleDet not found");
			}

		} else {
			throw new ProductException("vehicleDet list is empty");
		}

	}
}
