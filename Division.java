import java.util.Scanner;

public class Division {
	private static double a;
	private static double b;
	private double c;
	private double d;
	
	
	public Division() {
		Scanner input =  new Scanner(System.in);
		System.out.println("Input number \'c\' to divide into number \'d\':");
		this.c = input.nextDouble();
		this.d = input.nextDouble();
		input.close();
		System.out.println(divide(this.c, this.d));
	}

	
	
	public double getC() {
		return c;
	}



	public void setC(double c) {
		this.c = c;
	}



	public double getD() {
		return d;
	}



	public void setD(double d) {
		this.d = d;
	}



	public String divide(double c, double d) throws ArithmeticException{	
		try {
			if(c == 0) {
				throw new ArithmeticException();
			}
			if(!(d < 0 || d > 0) || !(d < 0 || d > 0)) {
				throw new IllegalArgumentException();
			}
		}catch(ArithmeticException AE) {
			AE.getMessage();
			AE.getStackTrace();
		}catch(IllegalArgumentException IAE) {
			IAE.getMessage();
			IAE.getStackTrace();
		}
		
		return c + " divided by " + d + " equals " + this.c / this.d + "\n";
	}
	
	public static double divide() throws ArithmeticException{	
		Scanner input =  new Scanner(System.in);
		System.out.println("Input number \'a\' to divide into number \'b\':");
		a = input.nextDouble();
		b = input.nextDouble();
		input.close();
		try {
			if(b == 0) {
				throw new ArithmeticException();
			}
			if(!(a < 0 || a > 0) || !(b < 0 || b > 0)) {
				throw new IllegalArgumentException();
			}
		}catch(ArithmeticException AE) {
			AE.getMessage();
			AE.getStackTrace();
		}catch(IllegalArgumentException IAE) {
			IAE.getMessage();
			IAE.getStackTrace();
		}
		
		return Division.a / Division.b;
	}
	
	public static void main(String[] arg) {
		/*2 variations: the non-static, which is test.
		 * Then the class Division.divide(); method and fields are static so no instantiation is require. I did this purposely for practice.*/
		Division test = new Division();

		
		/*Not sure why Each test works separately, but when both tests are done consecutively 
		there is a NoSuchElementException thrown from the Scanner.*/
		System.out.println(Division.divide());
		
	}
}
