/*
Program to Simulate an ATM
Problem Statement:
Create a BankAccount class with deposit, withdraw and balance display methods.
*/

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ravi", 12345, 10000);
        account.deposit(2000);
        account.withdraw(3000);
        account.displayBalance();
    }
}
