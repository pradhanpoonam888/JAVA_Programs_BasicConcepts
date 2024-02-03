package typeCasting;

public class SuperClass {
	
	public void c1() {
		System.out.println("Running c1() method of Superclass.");
	}
	public void c2() {
		System.out.println("Running c2() method of Superclass.");
	}
	public void c5() {
		System.out.println("Running c5() method of Superclass.");
	}

	public static void main(String[] args) {
		SuperClass sc=new SuperClass();
		sc.c1();sc.c2();

	}

}
