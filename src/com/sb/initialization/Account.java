package com.sb.initialization;

public class Account {
	private long accountNumber;
	private String firstName;
	private String lastName;
	private String accountType;
	private long balance;
	private String email;
	private String contact;
	private String address;
	private long zipcode;
	private long debitCard;
	private long creditCard;

	public Account() {
		super();
	}

	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountType=" + accountType + ", balance=" + balance + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", zipcode=" + zipcode + ", debitCard=" + debitCard + ", creditCard="
				+ creditCard + "]";
	}
}
