package ru.javadaddy.roadmap.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("1", 400);

        System.out.println("Баланс: " + bankAccount.getBalance());

        /**
         * Увеличение депозита.
         */
        double newDeposit = bankAccount.deposit(200);
        System.out.println(newDeposit);

        System.out.println("Баланс: " + bankAccount.getBalance());

        /**
         * Снятие со счёта.
         */
        double withdraw = bankAccount.withdraw(150);
        System.out.println(withdraw);

        System.out.println("Баланс: " + bankAccount.getBalance());
    }
}
