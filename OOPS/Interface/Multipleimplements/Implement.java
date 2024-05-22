package OOPS.Interface.Multipleimplements;

public class Implement implements Exp1,Exp2{

	public static void main(String[] args) {
		Implement i=new Implement();
		i.method1();
		i.method2();

	}

	@Override
	public void method2() {
		System.out.println("Implementing method2");
		
	}

	@Override
	public void method1() {
		System.out.println("Implementing method1");
		
	}

}
