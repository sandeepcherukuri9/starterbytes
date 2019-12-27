package com.sb.abs;

public abstract class Vehicle implements VehicleInterface {

	abstract public void applyBrake();
	abstract public void accelerate();
	abstract public void honk();
	
	@Override
	public void startEngine() {
		System.out.println("Engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine stopped");
	}
	
	public void getTyresInfo() {
		System.out.println("Mininum no of tyres: " + minNoOfTyres);
		System.out.println("Maximum no of tyres: " + maxNoOfTyres);
	}

}
