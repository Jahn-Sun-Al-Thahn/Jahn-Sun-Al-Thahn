import javax.swing.JOptionPane;

public class Hexagon {
	public static void main(String[] args) {
		int hexagonSide;
		double perimeter;
		double area;
		
		String input;
		input = JOptionPane.showInputDialog("Enter the value of the hexagon side: ");
		hexagonSide = Integer.parseInt(input);
		
		area = ((3 / Math.sqrt(3)) / 2) * (hexagonSide * hexagonSide);
		perimeter = 6 * hexagonSide;
		
		JOptionPane.showMessageDialog(null, "Your Hexagon Perimeter is " + perimeter);
		JOptionPane.showMessageDialog(null, "Your Hexagon Area is " + area);
		
		System.exit(0);
	}
}