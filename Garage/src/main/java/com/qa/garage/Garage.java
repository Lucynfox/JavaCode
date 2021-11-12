package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Vehicle;

public class Garage {
	List<Vehicle> vehiclesList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		vehiclesList.add(vehicle);
	}

}
