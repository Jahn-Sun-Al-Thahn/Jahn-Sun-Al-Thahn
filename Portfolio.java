import javax.swing.JOptionPane;
import java.util.Scanner;

public class Portfolio {
	Stocks[] userStocks;
	Bonds[] userBonds;
	String Owner;
	
	Portfolio(){
		
	}
	
	
	public Stocks[] getUserStocks() {
		return userStocks;
	}


	public void setUserStocks(Stocks userStocks, int positionOfStock) {
		this.userStocks[positionOfStock] = userStocks[positionOfStock];
	}


	public Bonds[] getUserBonds() {
		return userBonds;
	}


	public void setUserBonds(Bonds userBonds, int position) {
		this.userBonds[position] = userBonds;
	}


	public String getOwner() {
		return Owner;
	}


	public void setOwner(String owner) {
		Owner = owner;
	}


	public static void main(String[] arg) {
		Portfolio tester = new Portfolio();
		Stocks testSt = new Stocks();
		Bonds testB = new Bonds();
		tester.setUserStocks(testSt, 0);
		tester.setOwner("Mark Zuker");
		tester.setUserBonds(testB,0);
	}
}