package com.sb.abs;

public class SubhagruhaApartment implements BuildingInterface {

	public static void main(String[] args) {
		SubhagruhaApartment.getBricks();
	}
	
	@Override
	public void getArea() {
		System.out.println("print area");
		getBricks();
	}

	public static void getBricks() {
		System.out.println("Show me # of bricks");
	}
	
	@Override
	public void getOwner() {
		
	}

	@Override
	public void getNoOfFloors() {
		
	}

	@Override
	public void print(String msg) {
		
	}

}
