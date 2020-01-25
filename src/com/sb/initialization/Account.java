package com.sb.initialization;

public class Account {
	long accountNumber;
	String firstName;
	String lastName;
	String accountType;
	long balance;
	String email;
	String contact;
	String address;
	long zipcode;
	long debitCard;
	long creditCard;

	public Account() {
		super();
	}

	public Account(String firstName, String lastName, String accountType, String email, String contact, String address,
			long zipcode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = accountType;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountType=" + accountType + ", balance=" + balance + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", zipcode=" + zipcode + ", debitCard=" + debitCard + ", creditCard="
				+ creditCard + "]";
	}
}
