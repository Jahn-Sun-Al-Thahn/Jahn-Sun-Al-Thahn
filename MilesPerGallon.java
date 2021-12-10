import javax.swing.JOptionPane;

public class MilesPerGallon {
	public static void main(String[] args) {
		String input;
		double mpg;
		int milesDriven;
		float gasUsed;
		
		input = JOptionPane.showInputDialog("How many Miles have you driven?");
		milesDriven = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How many gallons of fuel have been used?");
		gasUsed = Float.parseFloat(input);
		
		mpg = milesDriven/gasUsed;
		
		JOptionPane.showMessageDialog(null, "Your Miles Per Gallon (MPG) is " + mpg);
		
		System.exit(0);
				
	}
}