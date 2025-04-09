package ru.javadaddy.roadmap.step4_OOP.topic6_BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка");
        }

        if (balance >= amount) {
            balance -= amount;
        }

        return balance;
    }
}
