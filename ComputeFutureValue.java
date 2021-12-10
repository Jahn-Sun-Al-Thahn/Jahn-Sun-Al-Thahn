import java.util.Scanner;

public class ComputeFutureValue {
	public static void main(String[] args) {
		double investmentAmount;
		float annualInterestRate;
		float monthlyInterestRate;
		int years;
		double futureInvestmentAmount;
		
		System.out.println("Please enter your Initial Investment amount:");
		Scanner input = new Scanner(System.in);
		investmentAmount = input.nextDouble();
		
		System.out.println("Please enter the Annual Interest Rate: ");
		annualInterestRate = input.nextFloat();
		
		System.out.println("Now Enter the total number of years for the investment: ");
		years = input.nextInt();
		
		monthlyInterestRate = annualInterestRate/1200;
		futureInvestmentAmount = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		
		System.out.println("Your Future Investment amount is: $" + futureInvestmentAmount);
		input.close();
	}
}