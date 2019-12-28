/**
 * 
 */
package com.sb.abs;

/**
 * @author P2891954
 *
 */
public abstract class appartment implements BuildingInterface {
	
	public int area;
    public String owner;
    public int noOfFloors;
    abstract public boolean isLiftAvailable();
    abstract public void getCarParkinginfo();
    
	/**
	 * @param args
	 */
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("noof sqfoot  " + area);
	}

	@Override
	public void getOwner() {
		// TODO Auto-generated method stub
		System.out.println("building owned by " + owner);
	}

	@Override
	public void getNoOfFloors() {
		// TODO Auto-generated method stub
		System.out.println("how many floors " + noOfFloors);
	}
}

