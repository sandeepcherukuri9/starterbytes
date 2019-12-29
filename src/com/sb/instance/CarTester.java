package com.sb.instance;

public class CarTester {
	public static void main(String[] args) {
		Car vh = new Car(4, "Electric", "Tesla", "Model S");
		System.out.println(vh);
		Car vh2 = new Car(4, "Electric", "Tesla", "Model 3");
		System.out.println(vh2);
		Car vh3 = new Car(100);
		System.out.println(vh3);
		/*
		 * vh.noOfTyres = 4; vh.engineType = "Electric"; vh.make = "Tesla"; vh.model =
		 * "Model S";
		 * 
		 * System.out.println(vh);
		 */
	}
}
