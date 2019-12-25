package com.sb.inherit;

public class Car extends Vehicle {
	public String make;
	public String model;
	private int currentGear;
	
	public boolean startEngine() {
		if(engineType == null) {
			System.out.println("Car engine type is not set, hence cannot start the engine");
			return false;
		}
		System.out.println("Car engine started");
		return true;
	}
	
	public boolean stopEngine() {
		if(engineType == null) {
			System.out.println("Car engine type is not set, hence cannot stop the engine");
			return false;
		}
		System.out.println("Car engine stopped");
		return true;
	}
	
	public boolean changeGear() {
		// System.out.println("Car Gear changed");
		changeGear(currentGear++);
		return true;
	}
	
	public boolean lowerGear() {
		changeGear(currentGear--);
		return true;
	}
	
	private void changeGear(int gearNo) {
		System.out.println("Car Gear " + gearNo + " changed");
	}
	
	public boolean applyBrake() {
		System.out.println("Brake applied");
		return true;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", noOfTyres=" + noOfTyres + ", engineType=" + engineType
				+ "]";
	}
	
}
