
public class Circle {
	
	//PRIVATE INSTANCE VARIABLES======================================
	private double radius;
	private String color;
	
	//PUBLIC GETTERS AND SETTERS=======================================
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//CONSTRUCTOR=======================================================
	public Circle(double radius, String color) {
		
		this.radius = radius;
		this.color = color;
	}
	
	// PUBLIC INSTANCE METHODS===========================================
	public double getArea() {
		
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		String output = "\n=======================================\n";
		output += "CIRCLE PARAMETERS\n";
		output += "RADIUS - "+radius+"\n";
		output += "COLOR - "+color+"\n";
		output += "AREA - "+getArea()+"\n";
		output += "=======================================\n";
		return output;
	}
	
	
	
	

}
