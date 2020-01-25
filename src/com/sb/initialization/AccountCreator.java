package com.sb.initialization;

public class AccountCreator {

	public static void main(String[] args) {
		ChaseAccount account = new ChaseAccount("Chaitanya", "cherukuri"); // Constructor
		ChaseAccount account2 = new ChaseAccount("Chaitanya", "akurathi");
		ChaseAccount account3 = new ChaseAccount("Sandeep", "Cherukuri", "SB", "sandeep.c@gmail.com", "+012345678", "US", 54321);
		System.out.println(account);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account.hashCode() + "," + account2.hashCode());
		account3.setFirstName("Sandeep Kumar");
		System.out.println(account3.getFirstName());
		
		ChaseAccount a1 = ChaseAccount.getInstance();
		ChaseAccount a2 = ChaseAccount.getInstance();
		System.out.println(a1.hashCode() + "," + a2.hashCode());
	}

}
