package Lab03;



public class ShapeTester {
	
	
	public static void main(String[] args){
		AbstractShape[] myShapes = new AbstractShape[16];

		
		myShapes[0] = new Rectangle(10,5);
		myShapes[1] = new Rectangle(20,30);
		myShapes[2] = new Rectangle(50,10);
		myShapes[3] = new Rectangle(-10,-20);
		myShapes[4] = new Circle(20);
		myShapes[5]= new Circle(10);
		myShapes[6]= new Circle(30);
		myShapes[7]= new Circle(-20);
		myShapes[8]= new Cuboid(20,10,6);
		myShapes[9]= new Cuboid(40,5,50);
		myShapes[10]= new Cuboid(30,20,20);
		myShapes[11]= new Cuboid(-20,30,-10);
		myShapes[12]= new Sphere(15);
		myShapes[13]= new Sphere(25);
		myShapes[14]= new Sphere(12);
		myShapes[15]= new Sphere(-10);
		
		for(AbstractShape shape : myShapes) {
			
			System.out.printf("Area: %.2f\n", shape.area());
			System.out.printf("Perimeter: %.2f\n", shape.perimeter());
			System.out.printf("Volume: %.2f\n", shape.volume());
			System.out.println();
			
		}
		
		System.out.println("Total number of Rectangle objects: " + Rectangle.numRectanglesCreated);
		System.out.println("Total number of Circle objects: " + Circle.numCirclesCreated);
		System.out.println("Total number of Cuboid objects: " + Cuboid.numCuboidsCreated);
		System.out.println("Total number of Sphere objects: " + Sphere.numSpheresCreated);
		System.out.println("Total number of Shape objects: " + AbstractShape.numShapesCreated);
		
	}
	
}
