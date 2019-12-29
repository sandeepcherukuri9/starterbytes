package com.sb.instance;

public class Car {
	int noOfTyres;
	String engineType;
	String make;
	String model;

	public Car() {
		super();
	}

	public Car(int noOfTyres) {
		// this(noOfTyres, "Electric", "Tesla", "Cyber Truck");
		this.noOfTyres = noOfTyres;
	}

	public Car(int noOfTyres, String engineType, String make, String model) {
		this.noOfTyres = noOfTyres;
		this.engineType = engineType;
		this.make = make;
		this.model = model;
		System.out.println("In constructor: " + this);
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

	public void stopEngine() {
		System.out.println("Engine stopped");
	}

	@Override
	public String toString() {
		return "Car [noOfTyres=" + noOfTyres + ", engineType=" + engineType + ", make=" + make + ", model=" + model
				+ "]";
	}

}
