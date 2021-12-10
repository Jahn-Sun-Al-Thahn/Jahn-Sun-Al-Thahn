import javax.swing.JOptionPane;

public class Circle{
	public static void main(String[] args) {
		float radius;
		double circumference;
		double diameter;
		double area;
		
		String input;
		input = JOptionPane.showInputDialog("Please Enter the radius: ");
		radius = Float.parseFloat(input);
		
		diameter = 2 * radius;
		circumference = (2 * Math.PI * radius);
		area = (Math.PI * radius) *(Math.PI * radius);
		
		JOptionPane.showMessageDialog(null, "The Circles Radius is " + radius);
		JOptionPane.showMessageDialog(null, "The Circles Diameter is " + diameter);
		JOptionPane.showMessageDialog(null, "The Circles Circumference is " + circumference);
		JOptionPane.showMessageDialog(null, "The Circles Area is " + area);
		
		System.exit(0);
	}
}