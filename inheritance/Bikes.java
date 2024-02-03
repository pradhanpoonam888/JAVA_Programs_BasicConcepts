package inheritance;

public class Bikes extends Vehicles {
	
	//final int wheels = 2;
	public Bikes() {
		this.setNoOfWheels(2);
	}
	
	public static void main(String [] args) {
		Bikes scooter=new Bikes();
		scooter.setColour("Light Green");
		scooter.setType("SCooty");
		
		//System.out.println(scooter.getColour() + " "+ scooter.getType()+ " " + scooter.getNoOFWheels() );
		scooter.printVehicleDetails();
	}
	
	
	

}
