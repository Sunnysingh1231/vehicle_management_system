package com.masai.entities;

import java.io.Serializable;
import java.util.Objects;

public class vehicleDet implements Serializable{
	
	int id;
	String name;
	int vehicleNumber;
	int vehicleReNumber;
	String vehicleType;
	
	
	

	public vehicleDet(int id, String name, int vehicleNumber, int vehicleReNumber, String vehicleType) {
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

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
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

}
