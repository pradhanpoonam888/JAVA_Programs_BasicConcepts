package importexample;

import java.util.Scanner;

public class ImportPackage {
	public static Scanner ip=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Hi there,"+"\n"+"Please enter your name : ");
		String name=ip.next();
		
		System.out.println("Hello "+name+", \n Hope you have a Great day "+name);
	}

}
