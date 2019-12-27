package com.sb.practice;

public class Tester {
	public static void main(String[] args) {
		Building building = new Building();
		Building building2 = new Building();

		// building 1 is owned by Sarath. It's in 150 sq.yds. 2 floors duplex with car
		// parking.
		building.area = 150;
		building.owner = "sarath";
		building.noOfFloors = 2;
		building.isCarParkingAvailable = true;
		building.isBikeParkingAvailable = false;
		building.carParkingCapacity = 1;
		building.setNoOfDuplexFloors = 1;
		// ToDo: Chaitanya
		// building.setCarParkingCapacity();
		// building.setBikeParkingCapacity(2);
		building.isFloorPlanReady();
		building.getArea();
		building.getNoOfFloors();
		building.getFloorPlanInfo();
		building.getCarParkingInfo();
		building.getBikeParkingInfo();
		building.getOwner();

		// building 2 is owned by Chaitanya. It's in 250 sq.yds. 4 floors - 2 floors are
		// duplex, 2 floors independent. car, 4 bikes parking.

		building2.area = 250;
		building2.owner = "chaitanya";
		building2.noOfFloors = 4;
		building2.isCarParkingAvailable = true;
		building2.isBikeParkingAvailable = true;
		building2.bikeParkingCapacity = 4;
		building2.carParkingCapacity = 2;
		building2.setNoOfDuplexFloors = 2;
		building2.isFloorPlanReady();
		building2.getArea();
		building2.getNoOfFloors();
		building2.getFloorPlanInfo();
		building2.getCarParkingInfo();
		building2.getBikeParkingInfo();
		building2.getOwner();

	}
}
