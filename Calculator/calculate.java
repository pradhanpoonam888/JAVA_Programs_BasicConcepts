package Calculator;

import java.util.Scanner;

public class calculate extends MainCalculator {

	public static Scanner input1=new Scanner(System.in);
	public static Scanner input2=new Scanner(System.in);
	
	public calculate(){
		System.out.println("Please enter the value of x : ");
		this.x= input1.nextInt();
		System.out.println("Please enter the value of y : ");
		this.y=input2.nextInt();
	}
	
	public static void main(String [] args) {
		
		calculate c=new calculate();
		

		System.out.println("Addition : "+ c.add(c.x, c.y));
		System.out.println("Substract : "+ c.subtract(c.x, c.y));
		System.out.println("Divide : "+ c.divide(c.x, c.y));
		System.out.println("Multiply : "+ c.multiply(c.x, c.y));
		
		
		
	}
	
}
