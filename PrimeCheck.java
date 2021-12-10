/*User inputs a number
 * function checks if prime number; 
 */
import java.util.Scanner;

public class PrimeCheck{
	int userIn;
	
	PrimeCheck(){
		
	};
	
	public static void main(String[] args) {
		PrimeCheck Test = new PrimeCheck();
		System.out.println("This program will tell you if the number you enter is prime or not.");
		System.out.print("You can enter 0 anyime to Quit");
		Test.setN();
		
		while(Test.getN() != 0) {
			Test.primeChecker();
			System.out.println("Please enter another Number: ");
			Test.setN();
		}

		
	}
	
	public void setN() {
		Scanner USR = new Scanner(System.in);
		userIn = USR.nextInt();
		USR.close();
	};
	
	public int getN() {
		return userIn;
	};
	
	public void primeChecker() {
		for(int i = 2; i <= userIn / 2; i++){
			if(userIn % 2 == 0) {
				System.out.println( userIn + " is not Prime");
			} else {
				System.out.println(userIn + " is Prime");
			}
		};
	};
}