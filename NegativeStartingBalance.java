
public class NegativeStartingBalance extends Exception{
	private static final long serialVersionUID = 1L;
	
	public NegativeStartingBalance() {
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String getMessage() {
		System.out.println("Balance in Deficiet: Negative Balance upon Start");
		return "Balance in Deficiet: Negative Balance upon Start";
	}
}
