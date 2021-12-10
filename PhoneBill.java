
public abstract class PhoneBill {
	private double monthlyRate;
	private double callRate;
		
	public PhoneBill() {
		this.monthlyRate = 0.0;
		this.callRate = 0.0;
	}
	
	public PhoneBill(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double getCallRate() {
		return callRate;
	}

	public void setCallRate(double callRate) {
		this.callRate = callRate;
	}

	public abstract double calculateBill(int time);
	
}
