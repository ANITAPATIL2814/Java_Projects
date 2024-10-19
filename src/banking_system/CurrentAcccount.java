package banking_system;

//extends bankAccount
class CurrentAccount extends BankAccount {
 private double transactionFee;

 // Constructor 
 public CurrentAccount(String accountHolderName, String accountNumber, double balance, double transactionFee) {
     super(accountHolderName, accountNumber, balance);  // Call parent constructor
     this.transactionFee = transactionFee;
 }


 @Override
 public void deductFees() {
     if (balance >= transactionFee) {
         balance -= transactionFee;  // Deduct transaction fee from balance
         System.out.println("Transaction fee deducted: " + transactionFee);
         System.out.println("New Balance: " + balance);
     } else {
         System.out.println("Insufficient balance to deduct the transaction fee.");
     }
 }

}