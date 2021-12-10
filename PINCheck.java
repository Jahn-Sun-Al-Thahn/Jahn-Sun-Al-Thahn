/*User Enters Pin
 * Program must ask the user to enter the Pin again
 * If Incorrect and error message comes up
 * If correct the Pin is accepted
 */
import javax.swing.JOptionPane;

public class PINCheck{
	String PIN;
	String userInput;
	
	PINCheck() {
		PIN = "1234";
	};
	
	public String getUserInput() {
		return userInput;
	};
	
	public String getPin() {
		return PIN;
	};
	
	public boolean verifyPin(String pin) {
		if(userInput == PIN) {
			JOptionPane.showMessageDialog(null, "Pin Accepted. You can Access your Account.");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect Pin. Try Again.", "Incorrect Pin", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	};
	
	public void setPin() {
		JOptionPane.showMessageDialog(null,"Please Enter a PIN");
		userInput = JOptionPane.showInputDialog("");
		PIN = userInput;
	};
	
	public static void main(String[] args) {
		PINCheck Test = new PINCheck();
		Test.setPin();
		while(Test.verifyPin(Test.getPin()) == false) {
			Test.setPin();
		}
		
		
	}
}