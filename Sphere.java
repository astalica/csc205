package Lab03;

public class Sphere extends AbstractShape {
	
	private double radius;
	protected static int numSpheresCreated;
	
	public Sphere(double rad) {
		radius = rad;
		incrementNumSpheresCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		
		double area = 4.0*Math.PI*radius*radius;
		return area;
		
	}
	
	public double perimeter() {
		return 0.0;
	}
	
	public double volume() {
		
		double volume = 4.0*Math.PI*radius*radius*radius;
		return volume;
		
	}
	
	protected void incrementNumSpheresCreated() {
		numSpheresCreated++;
	}
	
	protected void incrementNumShapesCreated()
	 {
		numShapesCreated++;
	 }
	
	public int getNumCreated() {
		return numSpheresCreated;
	}
	
	
}
