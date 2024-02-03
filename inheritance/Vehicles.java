package inheritance;

public class Vehicles {
	public String type;
	public int wheels;
	public String colour ;
	
	public void setColour(String clr) {
		colour = clr;
	}
	
	public void setType(String name) {
		type= name;
	}
	
	public void setNoOfWheels(int no) {
		wheels=no;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNoOFWheels() {
		return wheels;
	}

	public void printVehicleDetails() {
		System.out.println("Vehicle Details : " + "\n"
				+ "Name of the Vehicle " + getType() + "\n"
				+ "Number of Wheels " + getNoOFWheels() + "\n"
				+ "Colour of the Vehicle " + getColour() + "\n");
	}
}
