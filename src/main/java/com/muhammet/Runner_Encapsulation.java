package com.muhammet;

public class Runner_Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(9_999);
        bankAccount.deposit(150);
        System.out.println("bank account balance: " + bankAccount.getBalance());

    }
}

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount > 0)
            this.balance += amount;
    }

}