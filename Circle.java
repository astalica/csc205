package Lab03;

public class Circle extends AbstractShape {

	protected static int numCirclesCreated = 0;
	
	private double radius;
	
	public Circle(double rad) {
		
		radius = rad;
		incrementNumCirclesCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		double area = (radius*radius)*Math.PI;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public double volume() {
		return 0.0;
	}
	
	protected void incrementNumCirclesCreated() {
		numCirclesCreated++;
	}
	
	protected void incrementNumShapesCreated() {
		numShapesCreated++;
	}
	
	public int getNumCreated() {
		return numCirclesCreated;
	}
	
	
}
