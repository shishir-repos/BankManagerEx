package org.example;

import org.example.bankAccount.BankAccount;
import org.example.bankAccount.BankAccountImpl;
import org.example.bankAccount.InsufficientFundsException;
import org.example.bankAccount.InvalidAmountException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            BankAccountImpl bankAccount = new BankAccountImpl("Shishir", 0);

            bankAccount.deposit(500);
            bankAccount.withdraw(200);

            // Exception
            bankAccount.withdraw(600);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}