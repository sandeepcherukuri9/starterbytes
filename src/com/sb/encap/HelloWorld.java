/**
 * 
 */
package com.sb.encap;

import com.sb.test.SecondPrince;

/**
 * @author sarat
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	/* Encapsulation - Access Modifiers
	 * Same Class - King [private, default, protected, public]
	 * Same package Subclass - Prince [default, protected, public]
	 * Same package Non-Subclass - KingNonSubClass [default, protected, public]
	 * Different package Subclass - com.sb.test.SecondPrince [protected, public]
	 * Different package Non-Subclass - com.sb.test.KingNonSubClass [public]
	 * 
	 */
	
	public static void main(String[] args) {
		King king = new King();
		System.out.println("-------Access in Same Class------");
		king.testAccess();
		Prince prince = new Prince();
		System.out.println("-------Access in Same Package Sub-Class------");
		prince.testAccess();
		KingNonSubClass knc = new KingNonSubClass();
		System.out.println("-------Access in Same Package NonSub-Class------");
		knc.testAccess();
		SecondPrince sPrince = new SecondPrince();
		System.out.println("-------Access in Different Package Sub-Class------");
		sPrince.testAccess();
		com.sb.test.KingNonSubClass tknc = new com.sb.test.KingNonSubClass();
		System.out.println("-------Access in Different Package NonSub-Class------");
		tknc.testAccess();
	}

}
