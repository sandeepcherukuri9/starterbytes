package com.sb.practice;

public class Building {
	// Attributes
	public int sqfland;
	public String owner;
	public int nooffloors;
	// Activities
	public boolean floor_paln() {
		System.out.println("floor paln is ready");
		return true;
		}
	public void sqf() {
		System.out.println("noof sqfoot  "+ sqfland);
		}
	public void own() {
		System.out.println("building owned by"+ " " + owner);
		}
	public void floors() {
		System.out.println("how many floors " + nooffloors);
		}
	public void floorplan() {
		if (nooffloors == 2 ) {
			System.out.println("floor plan is to build 2 floors duplex with car parking " );
		}
		else {
			System.out.println(" 2 floors are duplex, 2 floors independent. car and 4 bikes parking");
		}
		}
}
