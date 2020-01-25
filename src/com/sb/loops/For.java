package com.sb.loops;

public class For {

	public static void main(String[] args) {
		for(int i=0; i <= 10; i++) {
			System.out.println(i);
		}
		for(int i=0,j=10; i<=10 && j>=0; i++,j--) {
			System.out.println(i + "," + j);
		}
		int k = 0;
		for(; k == 0 ;k++) {
			System.out.println("Printme");
		}
		/*
		 * for(;;) { System.out.println("I am infinite"); }
		 */
		
		// For each loop
		int[] a = new int[] {1,2,3,4,5,6};
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------");
		for(int i: a) {
			System.out.println(i);
		}
	}

}
