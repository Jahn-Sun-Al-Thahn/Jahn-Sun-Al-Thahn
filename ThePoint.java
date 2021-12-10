import javax.swing.JOptionPane;

public class ThePoint {
	int x;
	int y;
	
	ThePoint() {
		x = 0;
		y = 0;
	};
	
	ThePoint(int a, int b) {
		String input;
		input = JOptionPane.showInputDialog("Enter your X Coordinate: ");
		x = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter your Y Coordinate: ");
		y = Integer.parseInt(input);
		
		JOptionPane.showMessageDialog(null, "Your Coordinates are: " + x + ", " + y);
	};
	
	public int getX() {
		return x;
	};
	
	public int getY() {
		return y;
	};
	
	public void setX(int xA) {
		x = xA;
	};
	
	public void setY(int yA) {
		y = yA;
	};
	
	public void getDistance(int xA, int yA) {
		int difDistanceX;
		int difDistanceY;
		
		difDistanceX = xA - x;
		difDistanceY = yA - y;
		
		JOptionPane.showMessageDialog(null, "The Difference between the two Coordinates is: x by " + difDistanceX + ", and y by " + difDistanceY);
	};
}