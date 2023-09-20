package com.cbfacademy.accounts;

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank(0.05, 1000);

        Account account1 = bank.openAccount(100, "basic");
        Account account2 = bank.openAccount(2.5, "basic");
        Account account3 = bank.openAccount(1000, "savings");
        Account account4 = bank.openAccount(200, "savings");
        Account account5 = bank.openAccount(1, "current");
        Account account6 = bank.openAccount(100, "current");

        System.out.println(account5);
        account1.deposit(20);
        account2.withdraw(10);
        account3.withdraw(100);
        account4.deposit(73.11);
        account5.withdraw(11);
        account6.deposit(5);

        System.out.println(account2);
        System.out.println(account5);
        bank.update();
    }
}
