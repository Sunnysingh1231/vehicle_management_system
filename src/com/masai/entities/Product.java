package com.masai.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{
	
	int id;
	String name;
	int vehicleNumber;
	int vehicleReNumber;
	String vehicleType;
	
	
	

	public Product(int id, String name, int vehicleNumber, int vehicleReNumber, String vehicleType) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.vehicleReNumber = vehicleReNumber;
		this.vehicleType = vehicleType;
	}

	
	
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getVehicleNumber() {
		return vehicleNumber;
	}





	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}





	public int getVehicleReNumber() {
		return vehicleReNumber;
	}





	public void setVehicleReNumber(int vehicleReNumber) {
		this.vehicleReNumber = vehicleReNumber;
	}





	public String getVehicleType() {
		return vehicleType;
	}





	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}





	@Override
	public String toString() {
		return "vehicle details [id=" + id + ", Name=" + name + ", Vehicle Number=" + vehicleNumber + ", Vehicle Registration Number=" + vehicleReNumber + ", Vehicle Type=" + vehicleType
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(category, id, name, price, qty);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && qty == other.qty;
//	}

}
