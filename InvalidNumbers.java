import java.util.Scanner;
import java.util.*;

public class InvalidNumbers {
	static ArrayList<int[]> intList;
	private String inGoing;
	private int num;
	private boolean isNum = false;
	
	public InvalidNumbers() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive number.");
		inGoing = input.next();
		try {
			if(isNumber(this.inGoing) == false) {
				input.close();
				throw new InputMismatchException();
			}
			while(num > 0 || num < 0) {
				if(num > 0) {
					input.close();
					System.out.println("You've entered a positive INTEGER it's " + num);
					break;
				}else if(num < 0){
					input.close();
					throw new InputMismatchException();
				}
			}
			
		}catch(InputMismatchException IME) {
			System.out.println("TRY AGAIN. Incorrect Input: A positive integer is required");
		}
	}
	
	public boolean isNumber(String num) {
		int neoNum;
		neoNum = Integer.parseInt(num);
		if(neoNum <= 0 || neoNum > 0) {
			this.isNum = true;
			this.num = neoNum;
			return true;
		}
		return false;
	}

	public static void main(String[] arg) {
		InvalidNumbers test = new InvalidNumbers();
		
	}
}
