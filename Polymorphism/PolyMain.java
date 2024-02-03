package Polymorphism;


public class PolyMain extends CalculatePoly{
	
	
	
	
	public static void main(String [] args) {
		
		CalculatePoly c=new CalculatePoly();
		
		System.out.println("add int " + c.add(2, 3));
		System.out.println("add double " + c.add(2.3, 8.7));
		
	}
	
}


