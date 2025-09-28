package org.example.bankAccount;

public interface BankAccount {

    void deposit(double amount) throws InvalidAmountException;

    void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException;

    void getBalance();

}
