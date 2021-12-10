/*Same as the 1ST speed detector except add the else if statement.
 * Add in an additional message box "Congrats You're a Safe Driver"
 */
import javax.swing.JOptionPane;

public class SpeedDetector2{
	int Speed;
	SpeedDetector2() {
	};
	
	public void setSpeed() {
		String inputMPH;
		inputMPH = JOptionPane.showInputDialog(null,"Please Enter your Speed: ");
		Speed = Integer.parseInt(inputMPH);
	};
	
	public int getSpeed() {
		return Speed;
	};
	
	public void showSpeed() {
		if(Speed > 60) {
			JOptionPane.showMessageDialog(null, "Your speed is " + getSpeed() + " DECREASE your SPEED!", "Ticket Warning",JOptionPane.ERROR_MESSAGE);
		} else if(Speed < 60){
			JOptionPane.showMessageDialog(null, "Your speed is " + getSpeed());
			JOptionPane.showMessageDialog(null, "Congrats! You're a Safe Driver");
		}
		
	};
	public static void main(String[] args) {
		SpeedDetector2 User = new SpeedDetector2();
		User.setSpeed();
		User.showSpeed();
	}
}