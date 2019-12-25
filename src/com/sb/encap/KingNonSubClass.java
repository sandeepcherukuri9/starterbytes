package com.sb.encap;

public class KingNonSubClass {
	void testAccess() {
		King king = new King();
		System.out.println("My Public Property: " + king.myPublicProperty);
		System.out.println("My Protected Property: " + king.myProtectedProperty);
		System.out.println("My Default Property: " + king.myDefaultProperty);
		//System.out.println("My Private Property: " + myPrivateProperty);
	}
}
