package com.sb.test;

import com.sb.encap.King;

public class SecondPrince extends King{
	public void testAccess() {
		System.out.println("My Public Property: " + myPublicProperty);
		System.out.println("My Protected Property: " + myProtectedProperty);
		//System.out.println("My Default Property: " + myDefaultProperty);
		//System.out.println("My Private Property: " + myPrivateProperty);
	}
}
