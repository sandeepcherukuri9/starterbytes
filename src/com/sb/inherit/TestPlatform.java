package com.sb.inherit;

public class TestPlatform {
	public static void main(String[] args) {
		//Vehicle car = new Vehicle();
		//Vehicle car = new Car();
		Car car = new Car();
		car.engineType = "1.2L Petrol";
		car.make = "Maruthi";
		car.model = "S-Cross";
		car.noOfTyres = 4;
		System.out.println(car);
		System.out.println(car.startEngine());
		System.out.println(car.changeGear());
		System.out.println(car.changeGear());
		System.out.println(car.changeGear());
		System.out.println(car.lowerGear());
		System.out.println(car.lowerGear());
		//car.changeGear(2);
		//car.changeGear(4);
		//car.changeGear(1);
		//System.out.println(car.applyBrake());
		System.out.println(car.stopEngine());
	}
}
