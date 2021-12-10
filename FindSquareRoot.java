/*Find the square root of a number n
 * when nextGuess and lastGuess are almost == print the value as the sqrt
 * 1 as initial guess value
 * difference of next and last guess need to be less than .000001 
 * must print how many iterations it took to find the sqrt
 * 
 */

import java.util.Scanner;

public class FindSquareRoot{
	int N;
	int iterations;
	double SQRT;
	double nextGuess;
	double lastGuess;
	double initialGuess;
	
	FindSquareRoot(){
		
	};
	
	
	public static void main(String[] args) {
		FindSquareRoot Test = new FindSquareRoot();
		Test.setInteger();
		Test.calcSQRT();
		System.out.println("The Square roof of " + Test.getInteger() + " is " + Test.getSQRT());
		System.out.println("The program found the result in " + Test.getIterations() + " iterations.");
		
	}
	
	public void setInteger() {
		Scanner USR = new Scanner(System.in);
		System.out.println("Enter a Positive Integer");
		N = USR.nextInt();
		USR.close();
	};
	public double getInteger() {
		return N;
	};
	
	public void calcSQRT() {
		initialGuess = 1;
		iterations = 0;
		
		for(int i = 1; (lastGuess + 0.000001) <= nextGuess; i++){
			if(i == 1) {
				nextGuess = (initialGuess + N / initialGuess) / 2;
				lastGuess = nextGuess;
				iterations++;
			} else {
				nextGuess = (lastGuess + N / lastGuess)/2;
				lastGuess = nextGuess;
				SQRT = lastGuess;
				iterations++;
			}
			
		};
	}
	
	public double getSQRT() {
		return SQRT;
	};
	
	public int getIterations() {
		return iterations;
	};
}