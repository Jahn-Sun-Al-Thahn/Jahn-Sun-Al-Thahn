
public abstract class GeometricObject {
	private double Area;
	
	public GeometricObject() {
		this.Area = 0;
	}
	
	public double getArea() {
		return Area;
	}

	public void setArea(double area) {
		Area = area;
	}

	public abstract double area();

}
