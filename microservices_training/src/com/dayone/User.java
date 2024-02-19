package com.dayone;

public class User {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.checkBalance();
		Account a2 = new Account(70070, "Chiristo", 1500.50);
		a2.checkBalance();
		a1.withdrawAmount(100);
		a2.withdrawAmount(1000);
		a1.depositAmount(20000);
		a1.withdrawAmount(1000);	
	}
}
