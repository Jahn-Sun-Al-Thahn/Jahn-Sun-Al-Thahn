import java.util.Scanner;

public class FindAverage{
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double avg;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		a = input.nextInt();
		
		System.out.println("Please Enter another Number:");
		b = input.nextInt();
		
		System.out.println("Please Enter another Number:");
		c = input.nextInt();
		
		avg = (a + b + c)/ 3;
		System.out.println("The Average of " + a + " and " + b + " and " + c + " is " + avg);
		input.close();
	}
}