package banking_system;

//extends bankAccount
class SavingsAccount extends BankAccount {
    private double IR; //interest rate

    // Constructor 
    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);  // Call parent constructor
        this.IR = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * IR / 100;
        balance += interest;  // Add interest to balance
        System.out.println("Interest added: " + interest);
        System.out.println("New Balance: " + balance);
    }

}

