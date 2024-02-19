package com.dayone;

public class User {
    public static void main(String[] args) {

        Account acc1=new Account(123,"nimal",1000);

        try{
            acc1.deposit(1000);
            acc1.withDraw(10000);
        }catch (InvalidAmountException | InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }
    }
}
