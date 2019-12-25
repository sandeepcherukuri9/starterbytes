package com.sb.encap;

public class Prince extends King{
	void testAccess() {
		System.out.println("My Public Property: " + myPublicProperty);
		System.out.println("My Protected Property: " + myProtectedProperty);
		System.out.println("My Default Property: " + myDefaultProperty);
		//System.out.println("My Private Property: " + myPrivateProperty);
	}
	
	private void myPrivateMethod() {
		System.out.println("My Private method in Prince");
	}
}
