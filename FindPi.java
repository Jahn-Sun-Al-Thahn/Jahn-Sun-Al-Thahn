/*Use a loop to find PI
 * Must print number of iterations it took,
 * Must print the seconds it took for program to find result,
 * 
 */
import java.util.Scanner;
import java.util.Calendar;

public class FindPi{
	double PI;
	int userChoice;
	long timeNow;
	long timeEnd;
	long timeDiff;
	FindPi(){
		PI = 0;
	};
	
	public static void main(String[] args) {
		FindPi Test = new FindPi();
		Calendar SubTest = Calendar.getInstance();
		
		System.out.println("This program will iteratively find the digits of PI using the Leibniz Formula.");
		System.out.print("How mand iterations should we use? Please enter an integer...");
		Test.setUserIterChoice();
		Test.setStartTime(SubTest.getTimeInMillis());
		Test.calcLeibniz(Test.getUserIterChoice());
		Test.setEndTime(SubTest.getTimeInMillis());
		System.out.println("PI = " + Test.getPI());
		System.out.println("After " + Test.getUserIterChoice() + " iterations.");
		System.out.println("This Operation took " + Test.calcTimeDiff() + " seconds.");
		
	}
	
	public void setUserIterChoice() {
		int choice;
		Scanner userIn = new Scanner(System.in);
		userChoice = userIn.nextInt();
		userIn.close();
	};
	
	public int getUserIterChoice() {
		return userChoice;
	};
	
	public void setStartTime(long time) {
		timeNow = time;
	};
	
	public long getStartTime() {
		return timeNow;
	};
	
	public void setEndTime(long time) {
		timeEnd = time;
	};
	
	public long getEndTime() {
		return timeEnd;
	};
	
	public long calcTimeDiff() {
		timeDiff = timeNow - timeEnd;
		return timeDiff;
	};
	
	public void calcLeibniz(int iterations) {
		double deno = 1;
		
		for (int i = 0; i < iterations; i++) {
			 
	         if (i % 2 == 0) {
	            PI = PI + (1 / deno);
	         } else {
	            PI = PI - (1 / deno);
	         }
	         deno = deno + 2;
	      }
	      PI = PI * 4;
	};
	
	public double getPI() {
		return PI;
	};

}