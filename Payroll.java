import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		String Name;
		int hoursWorked;
		float hourlyPay;
		float grossPay;
		
		System.out.println("Please Enter Your Name: ");
		Scanner input = new Scanner(System.in);
		Name = input.nextLine();
		System.out.println("Your name is " + Name);
		
		System.out.println("How many hours did you work last week? ");
		hoursWorked = input.nextInt();
		System.out.println("You worked " + hoursWorked + " hours");
		
		System.out.println("What is your hourly pay rate?");
		hourlyPay = input.nextFloat();
		System.out.println("Your hourly payrate is " + hourlyPay + " dollars");
		
		grossPay = hourlyPay * hoursWorked;
		System.out.println("Hi " + Name + ", your weekly gross payment is " + "$" + grossPay);
		input.close();
	}
}