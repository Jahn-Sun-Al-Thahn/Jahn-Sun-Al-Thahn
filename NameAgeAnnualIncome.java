/*This challenge is must declare the following:
	a string variable named NAME
	an int variable names AGE
	a double variable named ANNUALPAY */

import java.util.*;

public class NameAgeAnnualIncome {
	public static void main(String[] args) {
		String name;
		int Age;
		double annualPay;
		
		System.out.println("What is your name? ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		input.close();
		
		System.out.println("What is your age? ");
		Scanner inputInt = new Scanner(System.in);
		Age =  inputInt.nextInt();
		inputInt.close();
		
		System.out.println("What is you desired Annual Pay? ");
		Scanner inputFloat = new Scanner(System.in);
		annualPay = inputFloat.nextFloat();
		inputFloat.close();
		
		System.out.println("My name is " + name + ", my age is " + Age + " and I hope to earn " + annualPay + " per year.");
		
		System.exit(0);
	}
	
}