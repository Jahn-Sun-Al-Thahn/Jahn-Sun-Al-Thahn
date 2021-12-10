/*This is the challenge that is SUM. This program must:
 *  store the integer 62 and 99 in variables,
 *  calculate and store their sums in a variable names SUM,
 *  Display the numbers that are added and their SUM on the screen.
 */

import java.util.*;

public class Sum {
	public static void main(String[] args) {
		int a;
		int b;
		int SUM;
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		SUM = a + b;
		
		System.out.println("The calculation is: " + a + " + " + b + " = " + SUM);
		input.close();
	}
}