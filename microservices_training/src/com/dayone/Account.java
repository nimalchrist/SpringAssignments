package com.dayone;

public class Account {
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	
	public Account(){
		
	}
	public Account(int accountId, String accountHolderName, double accountBalance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void checkBalance() {
		System.out.println("The current balance is: " + accountBalance);
	}
	
	public void withdrawAmount(double amount) {
		if(accountBalance > amount) {
			accountBalance -= amount;
			this.checkBalance();
		}
		else {
			System.out.println("Insufficient balance :(");
		}
	}
	
	public void depositAmount(double amount) {
		accountBalance += amount;
		this.checkBalance();
	}
	
}
