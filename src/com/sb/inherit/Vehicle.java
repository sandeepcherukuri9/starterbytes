package com.sb.inherit;

public class Vehicle {
	public int noOfTyres;
	public String engineType;
	
	public boolean startEngine() {
		System.out.println("Engine started");
		return true;
	}
	
	public boolean stopEngine() {
		System.out.println("Engine stopped");
		return true;
	}
	
	public boolean changeGear() {
		System.out.println("Gear changed");
		return true;
	}
	
	private void changeGear(int gearNo) {
		System.out.println("Gear " + gearNo + " changed");
	}
}
