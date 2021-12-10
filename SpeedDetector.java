/*Ask the Users Speed
 * Output Message box with Speed
 * Message warns driving they're driving too fast < 60 MPH
 */
import javax.swing.JOptionPane;

public class SpeedDetector{
	int Speed;
	SpeedDetector() {
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
			JOptionPane.showMessageDialog(null, "Your speed is " + getSpeed() + " you're going too Fast!", "Ticket Warning",JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Your speed is " + getSpeed());
		}
		
	};
	public static void main(String[] args) {
		SpeedDetector User = new SpeedDetector();
		User.setSpeed();
		User.showSpeed();
	}
}