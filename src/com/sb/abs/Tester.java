package com.sb.abs;

public class Tester {
	public static void main(String args[]) {
		SuperDummyVehicle sdv = new SuperDummyVehicle();
		sdv.startEngine();
		sdv.accelerate();
		sdv.applyBrake();
		sdv.honk();
		sdv.stopEngine();
	}
}
