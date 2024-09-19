package mainBank;

import bank.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 15253;
        bankAccount.accountHolder = "gojo";
        bankAccount.balance = 20000;

        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountHolder);
        System.out.println(bankAccount.balance);
    }

}
