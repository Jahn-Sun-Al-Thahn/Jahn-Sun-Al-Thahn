import java.util.Scanner;

public class TestGeometricObject {

	public static void main(String[] arg) {
		//Created Enough Rectangles and Circles for Comparisons
		Rectangle Bert = new Rectangle();
		Rectangle Ernie = new Rectangle();
		Circle2 Mark = new Circle2();
		Circle2 Walhberg = new Circle2();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("We shall compare the Areas of different similar and non similar shapes?");
		Bert.setLength(4);
		Bert.setWidth(5);
		Bert.area();
		
		Ernie.setLength(6);
		Ernie.setWidth(3);
		Ernie.area();
		
		Mark.setRadius(3);
		Mark.calcCircumference();
		Mark.area();
		
		Walhberg.setRadius(3);
		Walhberg.calcCircumference();
		Walhberg.area();
		
		//Now use the boolean methods to compare the different shapes against each other.
		System.out.println("Bert and Walhberg were checked to see if they were Equal: " + Bert.equals(Walhberg));
		System.out.println("Ernie and Mark were checked to see if Ernie was greater: " + Ernie.isGreater(Mark));
		System.out.println("Bert and Ernie were checked to see if Bert was lesser: " + Bert.isLess(Ernie));
		System.out.println("Mark Walhberg was checked to see if they are equal: " + Mark.equals(Walhberg));
		
		
		
		input.close();
	}
}
