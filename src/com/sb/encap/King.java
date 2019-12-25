package com.sb.encap;

public class King {
	public int myPublicProperty = 100;
	protected int myProtectedProperty = 200;
	int myDefaultProperty = 300;
	private int myPrivateProperty = 400; 
	
	void testAccess() {
		System.out.println("My Public Property: " + myPublicProperty);
		System.out.println("My Protected Property: " + myProtectedProperty);
		System.out.println("My Default Property: " + myDefaultProperty);
		System.out.println("My Private Property: " + myPrivateProperty);
	}
	
	private void myPrivateMethod() {
		System.out.println("My Private method in King");
	}
}
