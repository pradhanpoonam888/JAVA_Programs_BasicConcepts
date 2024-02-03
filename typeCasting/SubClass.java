package typeCasting;

public class SubClass extends SuperClass {
	public void c3() {
		System.out.println("Running c3() method of Subclass.");
	}
	public void c4() {
		System.out.println("Running c4() method of Subclass.");
	}
	public void c5() {
		System.out.println("Running c5() method of Subclass.");
	}

	public static void main(String[] args) {
		SubClass subc=new SubClass();
		subc.c1();subc.c2();
		subc.c3();subc.c4();
		subc.c5();
		System.out.println("=====================================");

		System.out.println("//Conversion of subclass object to superclass");
		System.out.println("=========UPCASTING=====================");
		SuperClass sup2=(SuperClass)subc;
		
		sup2.c1();
		sup2.c2();
		sup2.c5();
		System.out.println("=========DOWNCASTING=====================");
		
		SubClass subc3= (SubClass)sup2;
		subc3.c1();
		subc3.c2();
		subc3.c3();
		subc3.c4();
		subc3.c5();

	}
}
