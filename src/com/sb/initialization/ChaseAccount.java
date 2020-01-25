package com.sb.initialization;

public class ChaseAccount extends Account {
	private static ChaseAccount account = null;
	// Constructor of ChaseAccount
	// Used in Singleton design pattern
	private ChaseAccount() {
		super(); // Constructor of Account
	}
	
	// Singleton
	public static ChaseAccount getInstance() {
		if (account == null) {
			account = new ChaseAccount();
		}
		return account;
	}
	
	public ChaseAccount(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public ChaseAccount(String firstName, String lastName, String accountType, String email, String contact, String address,
			long zipcode) {
		super(firstName, lastName, accountType, email, contact, address, zipcode);
	}
	
	
}
