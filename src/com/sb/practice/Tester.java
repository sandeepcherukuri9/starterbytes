package com.sb.practice;

public class Tester {
	public static void main(String[] args) {
		Building building = new Building();
		Building building2 = new Building();
		
		// building 1 is owned by Sarath. It's in 150 sq.yds. 2 floors duplex with car parking.
		building.area = 150;
		building.owner = "sarath";
		building.noOfFloors = 2;
		building.isCarParkingAvailable = true;
		building.isBikeParkingAvailable = false;
		
		// ToDo: Chaitanya
		//building.setCarParkingCapacity(1);
		//building.setBikeParkingCapacity(2);
		
		building.isFloorPlanReady();
		building.getArea();
		building.getNoOfFloors();
		building.floorPlan();
		building.getOwner();
		
		// building 2 is owned by Chaitanya. It's in 250 sq.yds. 4 floors - 2 floors are duplex, 2 floors independent. car, 4 bikes parking.
		building2.area = 250;
		building2.owner = "chaitanya";
		building2.noOfFloors = 4;
		building2.isFloorPlanReady();
		building2.getArea();
		building2.getNoOfFloors();
		building2.floorPlan();
		building2.getOwner();


	}
}
