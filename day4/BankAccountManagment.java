public class BankAccountManagment {
    public static class BankAccount{

        public int accountNumber;
        protected String accountHolder;
        private double balance;

        public BankAccount(int accountNumber, String accountHolder, double balance){
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;

        }

        public double getbalance(){
            return balance;
        }

        public void setbalance(double balance){
            this.balance = balance;
        }

        public void displayAccount(){
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Account Holder : "+accountHolder);
            System.out.println("Balance : "+balance);
        }
    }

    public static class SavingsAccount extends BankAccount {

        private double interest;
        public SavingsAccount (int accountNumber, String accountHolder, double balance, double interest){
            super(accountNumber, accountHolder, balance);
            this.interest = interest;
        }

        public void displaySavings(){
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Account Holder : "+accountHolder);
            System.out.println("Balance : "+getbalance());
            System.out.println("Intersest : "+interest+"%");
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1234567,"Dheeraj",1000000.98);
        b1.displayAccount();
        System.out.println();

        b1.setbalance(2000000.00);

        b1.displayAccount();
        System.out.println();

        SavingsAccount sa = new SavingsAccount(987654321, "Bob", 20000.0, 4.5);
        sa.displaySavings();

    }
}
