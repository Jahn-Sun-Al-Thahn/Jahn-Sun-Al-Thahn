
public class Rectangle extends GeometricObject implements Comparable{
	private int width;
	private int Length;

	
	public Rectangle() {}
	public Rectangle(int width, int length) {
		this.width = width;
		this.Length = length;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
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
		double tempArea;
		tempArea = this.Length * this.width;
		super.setArea(tempArea);
		return tempArea;
	}

	
}
