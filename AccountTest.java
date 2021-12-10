
public class AccountTest {

	public static void main(String[] args) throws NegativeStartingBalance{
		BankAccount testA = new BankAccount();
		System.out.print(testA.deposit(304.24));
		System.out.print(testA.deposit(400));
		System.out.print(testA.withdraw(340.10));
		
		BankAccount testB = new BankAccount(4000);
		System.out.print(testB.deposit(30));
		System.out.print(testB.deposit(480.98));
		System.out.print(testB.withdraw(670.87));
		
		BankAccount testD = new BankAccount(2000);
		System.out.print(testD.deposit(30));
		System.out.print(testD.withdraw(4000));
		
		BankAccount testC = new BankAccount(-4000);

		
	}
}
