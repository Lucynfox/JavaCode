package com.qa.vehicles;

public class Car extends Vehicle {
	int numOfDoors;
	int mileage;

	public Car(String make, String model, int numberOfSeats, int numOfDoors, int mileage) {
		super(make, model, numberOfSeats);
		this.numOfDoors = numOfDoors;
		this.mileage = mileage;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
