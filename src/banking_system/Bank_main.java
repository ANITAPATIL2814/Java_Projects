package banking_system;

public class Bank_main {

	public static void main(String[] args) {
		 BankAccount savings = new SavingsAccount("Anita", "HHHH", 5000, 5);
	        
	        BankAccount current = new CurrentAccount("Anita", "PPPPP", 3000, 50);

	        // Using polymorphism  method calls calculateInterest() and deductFees(
	        System.out.println("Savings Account Operations:");
	        savings.displayAccountInfo();
	        
	       // Method Overriding: Both calculateInterest() and deductFees() are overridden in their respective subclasses
	        savings.calculateInterest();  
	        savings.deductFees();  

	        System.out.println("\nCurrent Account Operations:");
	        current.displayAccountInfo();
	        current.calculateInterest(); 
	        current.deductFees();  
	    }
	}


