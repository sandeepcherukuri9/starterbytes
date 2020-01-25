package com.sb.concepts;

public class Conditions {
	
	static void printDay(int day) {
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		   default:
			System.out.println("Invalid number of the day");
			break;
		}
	}
	
	static void printDayWithIf(int day) {
		if (day == 1) {
			System.out.println("Monday");
		}
		else if (day == 2) {
			System.out.println("Tuesday");
		}
		else if (day == 3) {
			System.out.println("Wednesday");
		}
		else if (day == 4) {
			System.out.println("Thursday");
		}
		else if (day == 5) {
			System.out.println("Friday");
		}
		else if (day == 6) {
			System.out.println("Saturday");
		}
		else if (day == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid number of the day");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * If-Condition
		 * Switch
		 */
		int day = 1;
		
		// printDayWithIf(day);
		printDay(day);
	}

}
