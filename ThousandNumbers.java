/*Write a while Loop that prints all numbers 1 to 1000
 * Only 10 numbers per line
*/

public class ThousandNumbers{
	
	public static void main(String[] args) {
		int num = 1;
		int endLine = 1;
		
		while(num < 1000) {
			System.out.println(num + " ");
			num++;
			if(num == endLine) {
				System.out.print("\n");
				endLine = endLine + 10;
			};
		};
		
	}
}