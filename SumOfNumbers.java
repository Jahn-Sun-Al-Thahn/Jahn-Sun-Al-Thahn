/*This program will sum the numbers from 1 to UserInput.
*/
import java.util.Scanner;

public class SumOfNumbers{
	int inputUser;
	int calculated;
	
	SumOfNumbers(){
		System.out.println("This program will add the numbers from 1 to the number you enter. \n Please enter a Number");
		Scanner incoming = new Scanner(System.in);
		inputUser = incoming.nextInt();
		incoming.close();
	};
	
	public int getUserInput() {
		return inputUser;
	}
	
	public int calculate(int userInput) {
		for(int i = 1, calculated = 0; i < inputUser; i++) {
			calculated = calculated + i;
		}
		return calculated;
	};
	
	public void showOutput() {
		System.out.println("You Entered " + inputUser);
		System.out.println("The Sum of ALL numbers from 1 to " + inputUser + " is " + calculated);
	};
	
	public static void main(String[] args) {
		SumOfNumbers Test = new SumOfNumbers();
		Test.calculate(Test.getUserInput());
		Test.showOutput();
	}
}