import javax.swing.JOptionPane;

public class ComputeBMI {
	public static void main(String[] args) {
		double heightInch;
		double heightMeters;
		double weightLBS;
		double weightKGS;
		double BMI;
		
		String input;
		input = JOptionPane.showInputDialog("Please Enter your height in Inches: ");
		heightInch = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Please Enter your weight in Pounds: ");
		weightLBS = Float.parseFloat(input);
		
		weightKGS = weightLBS / 2.205;
		heightMeters = (heightInch/39.97);
		BMI = (weightKGS / (heightMeters*heightMeters));
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index (BMI) is " + BMI);
		
		System.exit(0);
	}
}