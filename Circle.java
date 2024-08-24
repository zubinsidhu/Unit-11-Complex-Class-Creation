
public class Circle extends GeometricObject{
	
	private double radius;
	public static int numberOfObjects;
	
	public Circle(double r, String c, boolean f) {
		super(c, f);
		radius = r;
		numberOfObjects++;
	}
	public Circle(double r) {
		radius = r;
		numberOfObjects++;
	}
	public Circle() { this(1); }
	
	public double getRadius() { return radius; }
	public void setRadius(double newRadius) {radius = newRadius >= 0 ? newRadius: 0;}
	public double getArea() {return Math.PI * radius * radius;}
	public double getPerimeter() {return 2 * Math.PI * radius;}
	public static int getNumberOfObjects() {return numberOfObjects;}
	public String toString() {
		return super.toString() + "\nRadius: " + radius;
	}
	
	/*
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("c1 radius: " + c1.radius);
		Circle c2 = new Circle();
		System.out.println("c1 radius: " + c2.radius);
		System.out.println("Number of Circles: " + Circle.getNumberOfObjects());
	}
	*/
	
}