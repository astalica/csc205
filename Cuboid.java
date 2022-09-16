package Lab03;

public class Cuboid extends AbstractShape {

	protected static int numCuboidsCreated;
	private double length;
	private double width;
	private double height;
	
	public Cuboid(double len, double wid, double hght) {
		
		length = len;
		width = wid;
		height = hght;
		incrementNumCuboidsCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		
		double area = 2*(length*width+width*height+height*length);
		return area;
		
	}
	
	public double perimeter() {
		
		return 0.0;
		
	}
	
	public double volume() {
		
		double volume = length*width*height;
		return volume;
		
	}
	
	protected void incrementNumCuboidsCreated() {
		numCuboidsCreated++;
	}
	
	protected void incrementNumShapesCreated()
	 {
		numShapesCreated++;
	 }
	
	public int getNumCreated() {
		
		return numCuboidsCreated;
		
	}
	
	
}
