import java.util.Scanner;

/*
 */
public class Primes{
	int userIn;
	int count;
	
	Primes(){
		
	};
	
	public static void main(String[] args) {
		Primes Test = new Primes();
		System.out.println("Enter a number. This program will find all the prime numbers smaller than this number.");
		Test.setN();
		Test.primer();


	}
	
	public void setN() {
		Scanner USR = new Scanner(System.in);
		userIn = USR.nextInt();
		USR.close();
	};
	
	public void primer() {
		int Prime;
		for(int i = 1; i < userIn; i++, count++){
			if(userIn % 2 != 0) {
				Prime = userIn % 2;
				System.out.println(Prime + "\t");
				userIn = Prime;
			}
		};
		System.out.println("There are a total of " + count + "prime numbers");
	};
}