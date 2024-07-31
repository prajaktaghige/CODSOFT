package CodSoft;

public class ATM {
	
	
	
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && account.getBalance() >= amount) {
	            account.debit(amount);
	            System.out.println("Withdrawal of $" + amount + " successful.");
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            account.credit(amount);
	            System.out.println("Deposit of $" + amount + " successful.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Your current balance is $" + account.getBalance());
	    }
	}


