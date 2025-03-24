public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890", 5000.0);
        account.displayBalance();
        System.out.println();

        account.deposit(1500.0);
        account.displayBalance();
        System.out.println();

        account.withdraw(2000.0);
        account.displayBalance();
        System.out.println();

        account.withdraw(6000.0); // Should fail
        account.displayBalance();
    }
}



