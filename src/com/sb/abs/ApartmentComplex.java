package com.sb.abs;

public class ApartmentComplex extends Apartment {

	public int carParkingCapacity;
	public boolean isCarParkingAvailable;

	@Override
	public boolean isLiftAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void getCarParkinginfo() {
		// TODO Auto-generated method stub
		if (isCarParkingAvailable) {
			System.out.println("capacity of car parking is " + carParkingCapacity + " available");
		} else {
			System.out.println("car parking is not available");
		}

	}

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		
	}

	/*public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("noof sqfoot  " + area);
	}

	public void getOwner() {
		// TODO Auto-generated method stub
		System.out.println("building owned by " + owner);
	}

	public void getNoOfFloors() {
		// TODO Auto-generated method stub
		System.out.println("how many floors " + noOfFloors);
	} */

}
