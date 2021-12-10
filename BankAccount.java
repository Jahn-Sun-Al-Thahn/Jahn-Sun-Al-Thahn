
public class BankAccount {
	private double balance;
	
	public BankAccount() {
		this.balance = 0;
	}

	public BankAccount(double balance) throws NegativeStartingBalance {
		if(balance < 0) {
			throw new NegativeStartingBalance();
		}else {
			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String withdraw(double withdrawing) {
		String withdrawable;
		this.balance -= withdrawing;
		withdrawable = "Withdrawn Amount: " + withdrawing + "\n" + "New Balance: " + this.balance + "\n";
		return withdrawable;
	}
	
	public String deposit(double depositing) {
		String depositable;
		this.balance += depositing;
		depositable = "Deposit: " + depositing + "\n" + "New Balance: " + this.balance + "\n";
		return depositable;
	}
}
