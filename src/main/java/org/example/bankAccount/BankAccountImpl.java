package org.example.bankAccount;

public class BankAccountImpl implements BankAccount {

    private final String accountHolder;
    private double balance;

    public BankAccountImpl(String accountHolder, double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative!");
        }
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Initial balance cannot be negative!");
        }
        balance += amount;
        System.out.println(accountHolder + "'s Deposited: " + amount + ", Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Initial balance cannot be negative!");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println(accountHolder + "'s Withdrew: " + amount + ", Balance: " + balance);
        }
    }

    @Override
    public void getBalance() {
        System.out.println(accountHolder + "'s Current Balance: " + balance);
    }
}
