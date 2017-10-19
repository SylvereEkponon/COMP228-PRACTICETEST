
public class Cylinder extends Circle{
	
	//PRIVATE INSTANCE VARIABLES=================================
	private double height;

	//CONSTRUCTOR================================================
	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	//PUBLIC GETTERS AND SETTERS
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//PUBLIC INSTANCE METHOD
	public double getVolume() {
		return super.getArea()*height;
	}

	@Override
	public String toString() {
		String output = "\n=======================================\n";
		output += "CYLINDER PARAMETERS\n";
		output += "Radius - "+super.getRadius()+"\n";
		output +="Height - " + height+"\n";
		output += "Volume - " + this.getVolume()+"\n";
		output += "=======================================\n";
		return output;
	}
	
	
	
	
	
	

}
