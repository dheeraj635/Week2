
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private boolean loanApproved;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        loanApproved = amount <= getBalance() * 2;
    }

    public boolean calculateLoanEligibility() {
        return loanApproved;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private boolean loanApproved;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return 0;
    }

    public void applyForLoan(double amount) {
        loanApproved = amount <= overdraftLimit;
    }

    public boolean calculateLoanEligibility() {
        return loanApproved;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("SA1001", "Alice", 10000, 0.04);
        CurrentAccount ca = new CurrentAccount("CA2001", "Bob", 20000, 50000);

        accounts.add(sa);
        accounts.add(ca);

        sa.deposit(2000);
        ca.withdraw(5000);

        sa.applyForLoan(15000);
        ca.applyForLoan(30000);

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                System.out.println("Loan Eligible: " + ((Loanable) acc).calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}

