import java.util.Scanner;

public class LongDistanceBill extends PhoneBill {

	public LongDistanceBill() {
		super();
	}
	public LongDistanceBill(double MCR) {
		super(MCR);
	}
	
	public double calculateBill(int time) {
		double phoneBill;
		phoneBill = this.getCallRate() * (double)time + this.getMonthlyRate();
		return phoneBill;		
		
	} 
}
