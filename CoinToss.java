/*Generate Heads or Tails for a ## of Coin flips
 * User chooses the ## of coins
 * flip generates and displays side
 * total is displayed
 */
import java.util.Scanner;

public class CoinToss{
	final int Heads = 0;
	final int Tails = 1;
	int headCount;
	int tailsCount;
	int Coins;
	int coinsAmount;
	
	CoinToss() {	
		headCount = 0;
		tailsCount = 0;
	};
	
	public static void main(String[] args) {
		CoinToss Test = new CoinToss();
		Test.setcoinAmount();
		for(int i = 0; i < Test.getCoinAmount(); i++) {
			Test.flipCoin(Test.getCoinAmount());
			Test.showFlipsTot();
		}
	}
	
	public void setcoinAmount() {
		Scanner User = new Scanner(System.in);
		coinsAmount = User.nextInt();
		User.close();
	};
	
	public int getCoinAmount() {
		return coinsAmount;
	};
	
	public void flipCoin(int NumOfCoins) {
		String heads = "Toss: Heads!";
		String tails = "Toss: Tails!";
		String error = "Error: Incorrect Decision";
		
		for(int i = 0; i < coinsAmount; i++){
			if(Coins == 0) {
				headCount += 1;
				System.out.println(heads);
			} else if(Coins == 1){
				tailsCount += 1;
				System.out.println(tails);
			} else {
				System.out.println(error);
			}
		};
		
	};
	
	public void showFlipsTot() {
		System.out.println("Heads Facing up; " + headCount);
		System.out.println("Tails Facing up: " + tailsCount);
	};
}