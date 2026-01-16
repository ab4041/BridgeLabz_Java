/*
4. Banking System
Description: Create a banking system with different account types:
- Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
- Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
- Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
- Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
- Use encapsulation to secure account details and restrict unauthorized access.
- Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        setAccountNumber(accountNumber);
        setHolderName(holderName);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty())
            throw new IllegalArgumentException("Account number cannot be empty");
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    private void setHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty())
            throw new IllegalArgumentException("Holder name cannot be empty");
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    // ✅ Concrete methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdraw successful. New balance: " + getBalance());
    }

    // ✅ Polymorphism: implemented in child classes
    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request received for Savings Account: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // eligibility rule
    }
}

class CurrentAccount extends BankAccount {
    private double interestRate = 0.01; // 1%

    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request received for Current Account: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 20000; // eligibility rule
    }
}

public class Main4_BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new SavingsAccount("SAV1001", "Varun", 12000);
        BankAccount a2 = new CurrentAccount("CUR2001", "Rahul", 18000);

        accounts.add(a1);
        accounts.add(a2);

        System.out.println("---- Interest Calculation (Polymorphism) ----");
        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("Interest: ₹" + acc.calculateInterest());

            acc.applyForLoan(50000);
            System.out.println("Eligible for Loan? " + acc.calculateLoanEligibility());
            System.out.println("-----------------------------------");
        }
    }
}
