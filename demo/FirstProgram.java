package demo;

public class FirstProgram {
	
	private String name ="Sel";

	public FirstProgram() {
		System.out.println("The Contructor of this PRogram was called !!");
		
	}

	public static void main(String[] args) {

		FirstProgram ref=new FirstProgram();
		System.out.println(ref.name);
		System.out.println(Sum.Sum(10, 2));
	}

}
