package com.sb.practice;

public class Building {
	// Attributes
	public int area;
	public String owner;
	public int noOfFloors;
	
	public boolean isCarParkingAvailable;
	public int carParkingCapacity;
	
	public boolean isBikeParkingAvailable;
	public int bikeParkingCapacity;

	// Activities
	public boolean isFloorPlanReady() {
		System.out.println("floor paln is ready");
		return true;
	}

	public void getArea() {
		System.out.println("noof sqfoot  " + area);
	}

	public void getOwner() {
		System.out.println("building owned by " + owner);
	}

	public void getNoOfFloors() {
		System.out.println("how many floors " + noOfFloors);
	}

	public void floorPlan() {
		if (noOfFloors == 2) {
			System.out.println("floor plan is to build 2 floors duplex with car parking ");
		} else {
			System.out.println(" 2 floors are duplex, 2 floors independent. car and 4 bikes parking");
		}
	}
}
