/*Find the number of rice on the 64th position,
 * find the total number of rice calculated with combining all rice on all squares
 * 
 */
import java.util.Scanner;

public class RiceChessboard{
	int totalRice;
	int[] Chessboard;
	
	RiceChessboard(){
		totalRice = 0;
	};
	
	public static void main(String[] args) {
		RiceChessboard Test = new RiceChessboard();
		Test.calcRiceOnBoard();
		System.out.println("There are " + Test.riceQuery(64) + " rice peices on the 64th position.");
		System.out.println("There are " + Test.totalRiceQuery() + " total peices of rice on the board.");
	}
	
	public void calcRiceOnBoard() {
		for(int i = 1, start = 1; i < 204; i++) {
			if(start == 1) {
				Chessboard[i] = start;
				System.out.println(Chessboard[i] + " rice on square " + i );
			} else {
				Chessboard[i] = Chessboard[i--] * 2;
				System.out.println(Chessboard[i] + " rice on square " + i );
			}
		}
	};
	
	public int riceQuery(int position) {
		return Chessboard[position];
	};
	
	public int totalRiceQuery() {
		int tempTotal = 0;
		
		for(int i = 1; i < 204; i++) {
			tempTotal = tempTotal + Chessboard[i];
		};
		totalRice = tempTotal;
		return totalRice;
	};
}