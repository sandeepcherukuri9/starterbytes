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
	public boolean isDuplexRequired;
	public int setNoOfDuplexFloors;

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

	// public int setCarParkingCapacity(int carParkingCapacity) {
	// TODO Auto-generated method stub
	// return carParkingCapacity;
	// }
	// public int setBikeParkingCapacity(int bikeParkingCapacity ) {
	// TODO Auto-generated method stub
	// return bikeParkingCapacity;
	// }
	public void getCarParkingInfo() {
		if (isCarParkingAvailable) {
			System.out.println("capacity of car parking is " + carParkingCapacity + " available");
		} else {
			System.out.println("car parking is not available");
		}

	}

	public void getBikeParkingInfo() {
		if (isBikeParkingAvailable) {
			System.out.println("capacity of bike parking is " + bikeParkingCapacity + " available");
		} else {
			System.out.println("bike parking is not available");
		}

	}

	/*
	 * public void getFloorPlanInfo() { if (noOfFloors == 1) {
	 * System.out.println("construct only independent house"); } else if (noOfFloors
	 * > 1 & noOfFloors == 2) { System.out.
	 * println("construct one floor with duplix and other with independent ");
	 * 
	 * } else if (noOfFloors > 2 & noOfFloors <= 4) { System.out.
	 * println("construct two floors with duplix and other with independent");
	 * 
	 * } else if (noOfFloors > 4) {
	 * System.out.println("floor plan is not yet decided"); } else {
	 * System.out.println("floor plan is not ready "); } }
	 */
	public void getFloorPlanInfo() {
		if (noOfFloors == 1) {
			System.out.println("construct only independent floors");
		} else {
			System.out.println("construct " + setNoOfDuplexFloors + " duplex and remaing independent floors ");
		}
	}

}
