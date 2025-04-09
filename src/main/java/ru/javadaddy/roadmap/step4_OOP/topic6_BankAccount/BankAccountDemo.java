package ru.javadaddy.roadmap.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1", 400);
        double newDeposit = bankAccount.deposit(200);
        System.out.println(newDeposit );

        double withdraw = bankAccount.withdraw(-100);
        System.out.println(withdraw);
    }
}
