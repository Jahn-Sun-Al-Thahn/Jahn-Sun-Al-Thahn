/*The user enters numbers, 
 * the numbers add together, 
 * until the user enters 0 to stop
 */
import java.util.Scanner;

public class Summation{
	int userInput;
	int Summed;
	
	Summation(){
		Scanner incoming = new Scanner(System.in);
		System.out.println("Hi!, This program will add all the numbers you enter, then add them up! \n Enter a number: ");
		userInput = incoming.nextInt();
		incoming.close();
	};
	
	public void continuous() {
		Scanner newIncoming = new Scanner(System.in);
		while(userInput != 0) {
			System.out.println("You've entered " + userInput);
			Summed += userInput;
			System.out.println("The Sum is " + Summed);
			userInput = newIncoming.nextInt();
			if(userInput == 0) {
				System.out.println("The sum of all the numbers entered is: " + Summed);
				System.exit(0);
			};
		}
		newIncoming.close();
	};
	
	public static void main(String[] args) {
		Summation Test = new Summation();
		Test.continuous();
	}
}