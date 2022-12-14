package Lab03;

public class Rectangle extends AbstractShape {
	
	private double length;
    private double width;
	protected static int numRectanglesCreated = 0;
	
	public Rectangle(double len, double wid) //constructor
    {
       length = len;
       width  = wid;
       incrementNumRectanglesCreated();
       incrementNumShapesCreated();
    }
    public double area()
    {
	    double area = length * width;
	    return area;
    } 
    public double perimeter()
    {
	    double perimeter = 2 * (length + width);
       return perimeter;
	 }
    public double volume()
    {
	  	return 0.0;
	 }
	 protected void incrementNumRectanglesCreated()
	 {
		numRectanglesCreated++;
	 }
	 protected void incrementNumShapesCreated()
	 {
		numShapesCreated++;
	 }
    public int getNumCreated()
    {
	  	return numRectanglesCreated;
	 }

	
	
}
