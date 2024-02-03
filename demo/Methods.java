package demo;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(); // method call
	}
	
	public static void m1() {
		m2();
		System.out.println("Running in m1() Method ");
	}
	
	public static void m2() {
		m3();
		System.out.println("Running in m2() Method ");
	}
	public static void m3() {
		m4();
		System.out.println("Running in m3() Method ");
	}
	public static void m4() {
		m5();
		System.out.println("Running in m4() Method ");
	
	}
	public static void m5() {
		m6();
		System.out.println("Running in m5() Method ");
	}
	public static void m6() {
		System.out.println("Running in m6() Method ");
	}
}
