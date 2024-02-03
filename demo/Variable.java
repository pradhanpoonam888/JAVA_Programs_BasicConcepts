package demo;

public class Variable {
	//Global variable can be used across the class functions;
	public static int k =100;
	String name="Poonam";
	public static double d;
	public static int ii ;
	public static String s;
	public static long l;
	public static boolean b;
	public static char c;
	public static byte by;

	public static void main(String[] args) {
		// Local Variable 
		int i; // Declaration
		i=20; //Initialization
		System.out.println(i); // Utilization
		
		//Declaration & initialization in one line
		int j =10;
		System.out.println(j);
		
		// Declaration without initialization ;
		int z;
		//System.out.println(z); // it cannot be utilised till it has been initialised .
		m2();
		m3();
		m4();
		System.out.println("the Final value of k is : "+ k);
		Variable ref=new Variable();
		
		System.out.println("Name : "+ref.name);
		
		System.out.println("default value of double -d is "+d);
		System.out.println("default value of int -ii is "+ii);
		System.out.println("default value of String -s is "+s);
		System.out.println("default value of char -c is "+c);
		System.out.println("default value of long -l is "+l);
		System.out.println("default value of boolean -b is "+b);
		System.out.println("default value of byte -by is "+by);
	}
	
	/**
	 * Func m2
	 */

	public static void m2() {
		// Local variable scope is limited till the function it is defined in.
		// System.out.println(i);
		k=k+100;
		 System.out.println(k);
		 
	}
	
	public static void m3() {
		// Local variable scope is limited till the function it is defined in.
		// System.out.println(i);
		k=k+100;
		System.out.println(k);
	}
	
	public static void m4() {
		// Local variable scope is limited till the function it is defined in.
		// System.out.println(i);
		k=k+100;
		System.out.println(k);
	}
}
