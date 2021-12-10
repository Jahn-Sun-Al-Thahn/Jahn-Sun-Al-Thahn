/*Generate Random number to be guessed 1 - 100 
 * Display guessing prompt
 * player guesses
 * display high low or correct
 * guess until the correct answer

 */
import java.util.Scanner;

public class GuessTheNumber{
	int userGuess;
	int genNum;
	
	GuessTheNumber(){
		
	};
	
	public static void main(String[] args) {
		GuessTheNumber Test = new GuessTheNumber();
		System.out.print("Guess a number between 0 -100");
		Test.setGuess();
		Test.playerGuess();
		while (Test.getPlayerGuess() != Test.getGenNum()) {
			Test.compareGuess();
			Test.playerGuess();
		};
	}
	
	 public void setGuess() {
		 genNum = (int)(Math.random() * 101);
	 };
	 
	 public void playerGuess() {
		Scanner player = new Scanner(System.in);
		userGuess = player.nextInt();
		player.close();
	 };
	 
	 public int getPlayerGuess() {
		 return userGuess;
	 };
	 
	 public int getGenNum() {
		return genNum; 
	 };
	 
	 public void compareGuess() {
		 if(userGuess != genNum) {
			 if(userGuess < genNum) {
				 System.out.println("Your guess is LOW");
			 } else {
				 System.out.println("Your guess is HIGH");
			 }
		 } else {
			 System.out.println("Yes, the number is " + genNum + " /n Congrats! You guessed the number.");
		 }
	 };
}