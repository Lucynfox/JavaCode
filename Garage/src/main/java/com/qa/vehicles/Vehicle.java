package com.qa.vehicles;

public class Vehicle {
	String make;
	String model;
	int numberOfSeats;

	public Vehicle(String make, String model, int numberOfSeats) {
		this.make = make;
		this.model = model;
		this.numberOfSeats = numberOfSeats;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}
