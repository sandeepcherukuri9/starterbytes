package com.sb.test;

import com.sb.encap.King;

public class KingNonSubClass {
	public void testAccess() {
		King king = new King();
		System.out.println("My Public Property: " + king.myPublicProperty);
		//System.out.println("My Protected Property: " + king.myProtectedProperty);
		//System.out.println("My Default Property: " + myDefaultProperty);
		//System.out.println("My Private Property: " + myPrivateProperty);
	}
}
