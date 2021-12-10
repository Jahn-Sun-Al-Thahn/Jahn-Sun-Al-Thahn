import java.util.Scanner;

public class TestPhoneBill {

	public static void main(String[] args) {
		TestPhoneBill test = new TestPhoneBill();
		
		//Creates long distance bill reference and object, declares a integer for time, and create a scanner for input.
		LongDistanceBill Dave = new LongDistanceBill();
		int time;
		Scanner input = new Scanner(System.in);
		
		//Prompts the user that the program started. Asks for multiple inputs for the calculations.
		System.out.println("This program will calculate your phone bill for you!");
		
		System.out.println("What is your call rate?");
		Dave.setCallRate(input.nextDouble());
		
		System.out.println("What is your monthly rate?");
		Dave.setMonthlyRate(input.nextDouble());
		
		//Uses the time integer for the input and then uses time to input into calculate bill to get the complete calculation.
		System.out.println("How many minutes did you talk?");
		time = input.nextInt();
		System.out.println("Your Monthly bill is $" + Dave.calculateBill(time));
		
		//closes out scanner for no memory leaks.
		input.close();
		
	}
}
