package com.sb.practice;

public class Tester {
	public static void main(String[] args) {
		Building building = new Building();
		Building building2 = new Building();
		
		// building 1 is owned by Sarath. It's in 150 sq.yds. 2 floors duplex with car parking.
		building.sqfland = 150;
		building.owner = "sarath";
		building.nooffloors = 2;
		building.floor_paln();
		building.sqf();
		building.floors();
		building.floorplan();
		building.own();
		// building 2 is owned by Chaitanya. It's in 250 sq.yds. 4 floors - 2 floors are duplex, 2 floors independent. car, 4 bikes parking.
		building2.sqfland = 250;
		building2.owner = "chaitanya";
		building2.nooffloors = 4;
		building2.floor_paln();
		building2.sqf();
		building2.floors();
		building2.floorplan();
		building2.own();


	}
}
