package com.sb.loops;

public class While {
	public static void main(String[] args) {
		int x = 10;
		while(x >= 20) {
			System.out.println(x);
		}
		
		do {
			System.out.println("In do while: " + x);
		} while (x >= 20);
	}
}
