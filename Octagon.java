import javax.swing.JOptionPane;

public class Octagon {
	public static void main(String[] args) {
		int OctoSide;
		double perimeter;
		double area;
		
		String input;
		input = JOptionPane.showInputDialog("Enter the value of the Octagon side: ");
		OctoSide = Integer.parseInt(input);
		
		area = 2 * (1 + Math.sqrt(2)) * (OctoSide * OctoSide);
		perimeter = 8 * OctoSide;
		
		JOptionPane.showMessageDialog(null, "Your Octagon Perimeter is " + perimeter);
		JOptionPane.showMessageDialog(null, "Your Octagon Area is " + area);
		
		System.exit(0);
	}
}