import java.util.Scanner;

/* Makes a password as long as userinput
 * password is made up of randomly generated numbers
*/

public class PasswordGenerator{
	int userInput;
	int[] password;
	int randomer;
	
	PasswordGenerator(){
		System.out.println("How many digits do you want to use for your numeric password?");
		Scanner incoming = new Scanner(System.in);
		userInput = incoming.nextInt();
		incoming.close();
	};
	
	public void genRandPassword() {
		for(int i = 0; i < userInput; i++) {
			randomer = (int)(Math.random() * 10);
			password[i] = randomer;
			System.out.print(password[i] + " ");
		};
	};
	
	public static void main(String[] args) {
		PasswordGenerator NewPassword = new PasswordGenerator();
		System.out.println("Your password is ");
		NewPassword.genRandPassword();
		
	}
}