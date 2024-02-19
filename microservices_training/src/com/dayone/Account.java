package com.dayone;

public class Account {
    private int accountId;
    private String accountHolderName;
    private double balance;

    public Account(int accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount) throws InsufficientBalanceException {
        if(amount >= this.balance){
            throw new InsufficientBalanceException("insufficient balance");
        }else this.balance -= amount;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0.0){
            throw new InvalidAmountException("Invalid amount");
        }else{
            this.balance += amount;
        }
    }

}
