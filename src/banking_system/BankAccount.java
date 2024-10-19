package banking_system;

class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    // Constructor 
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //  display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    //  interest calculation  overridden by SavingsAccount
    public void calculateInterest() {
        System.out.println("No interest calculation for this account.");
    }

    // deducting fees  overridden by CurrentAccount
    public void deductFees() {
        System.out.println("No fees deduction for this account.");
    }
}