package com.qa.vehicles;

public class Van extends Vehicle {
	int maxSafeSpeed;

	public Van(String make, String model, int numberOfSeats, int maxSafeSpeed) {
		super(make, model, numberOfSeats);
		this.maxSafeSpeed = maxSafeSpeed;
		// TODO Auto-generated constructor stub
	}

	public int getMaxSafeSpeed() {
		return maxSafeSpeed;
	}

	public void setMaxSafeSpeed(int maxSafeSpeed) {
		this.maxSafeSpeed = maxSafeSpeed;
	}

}
