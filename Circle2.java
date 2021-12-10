
public class Circle2 extends GeometricObject implements Comparable{
	private double Radius;
	private double Circumference;
	
	public Circle2() {}
	public Circle2(double circumference, double radius) {
		this.Radius = radius;
		this.Circumference = circumference;
	}

	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public double getCircumference() {
		return Circumference;
	}
	public void calcCircumference() {
		this.Circumference = 2 * Math.PI * this.Radius;
	}

	public void calculateArea() {
		this.setArea((Math.PI * (this.Radius * this.Radius)));
		
	}
	@Override
	public boolean equals(GeometricObject a) {
		if(a.getArea() == this.getArea()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isGreater(GeometricObject a) {
		if(this.getArea() > a.getArea()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isLess(GeometricObject a) {
		if(this.getArea() < a.getArea()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public double area() {
		calculateArea();
		return this.getArea();
	}

}
