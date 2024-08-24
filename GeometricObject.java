import java.util.*;
public class GeometricObject {

	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {this("white", false);}
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	
	public String getColor() {return color;}
	public void setColor(String c) {color = c;}
	public boolean isFilled() {return filled;}
	public void setFilled(boolean f) {filled = f;}
	public Date getDateCreated() {return dateCreated;}
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
}
