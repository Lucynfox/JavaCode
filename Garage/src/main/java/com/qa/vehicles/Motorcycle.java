package com.qa.vehicles;

public class Motorcycle extends Vehicle {
	int topSpeed;

	public Motorcycle(String make, String model, int numberOfSeats, int topSpeed) {
		super(make, model, numberOfSeats);
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

}
