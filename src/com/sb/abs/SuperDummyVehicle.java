package com.sb.abs;

public class SuperDummyVehicle extends Vehicle {

	@Override
	public void applyBrake() {
		System.out.println("Remove your hands from steering and Pray god :D");		
	}

	@Override
	public void accelerate() {
		System.out.println("Get down and push the SuperDummyVehicle!!");
	}

	@Override
	public void honk() {
		System.out.println("Shout Shout Shout!!");
	}
	
	public void startEngine() {
		System.out.println("Open the Bonet, Tap Tap and Tap the Engine");
	}
	
	public void stopEngine() {
		System.out.println("Open the Bonet, Hit Hit and Hit the Engine");
	}

}
