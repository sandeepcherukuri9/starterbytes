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
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public ChaseAccount(String firstName, String lastName, String accountType, String email, String contact, String address,
			long zipcode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = accountType;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.zipcode = zipcode;
	}
}
