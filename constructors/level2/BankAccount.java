/*
Problem Statement:
BankAccount with different access modifiers.
*/

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }
}
