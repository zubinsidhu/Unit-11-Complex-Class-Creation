
public class Rectangle extends GeometricObject{

	private double width = 1;
	private double height = 1;
	
	public Rectangle(double w, double h, String c, boolean f) {
		super(c, f);
		width = w;
		height = h;
	}
	public Rectangle() {this(1, 1, "white", false);}
	
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public void setWidth(double newWidth) {width = newWidth;}
	public void setHeight(double newHeight) {height = newHeight;}
	
	public double getArea() {return width * height;}
	public double getPerimeter() {return 2 * (width + height);}
	
	public String toString() {
		return super.toString() + "\nRectangle with width " + width + " and height " + height + ": ";
	}
}