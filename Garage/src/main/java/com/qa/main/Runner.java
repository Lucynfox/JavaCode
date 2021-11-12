package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Runner {
	public void main(String[] args) {
		Garage myGarage = new Garage();
		Vehicle car = new Car("Ford", "Fiesta", 5, 5, 2000);
		Vehicle motorcycle = new Motorcycle("MakeOfMotorbike", "ModelOfMotorbike", 1, 150);
		Vehicle van = new Van("MakeOfVan", "ModelOfVan", 2, 50);

		myGarage.addVehicle(car);
		myGarage.addVehicle(motorcycle);
		myGarage.addVehicle(van);

		System.out.println(myGarage);
	}

}
