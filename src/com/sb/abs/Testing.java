/**
 * 
 */
package com.sb.abs;

/**
 * @author P2891954
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex_appartement appartment1 = new Complex_appartement();
		appartment1.carParkingCapacity = 20;
		appartment1.area = 150;
		appartment1.noOfFloors= 5;
		appartment1.owner = "chaitanya";
		appartment1.isCarParkingAvailable = true;
		appartment1.getArea();
		appartment1.getNoOfFloors();
		appartment1.getCarParkinginfo();
		appartment1.isLiftAvailable();
		appartment1.getOwner();

	}

}
