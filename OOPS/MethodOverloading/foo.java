package OOPS.MethodOverloading;

public class foo {
	
	public void doit(int i) {
		System.out.println("only int value " + i);
		
	}
	
	public void doit(float i) {
		System.out.println("only float value : " + i);
		
	}
	
	public void doit(float i , float j) {
		System.out.println("only float value sum of  " + i + " + " + j +" = "+(i+j));
		
	}

	public static void main(String[] args) {
		foo f=new foo();
		f.doit(123);
		f.doit(6.7f);
		f.doit(34.56f, 78.23f);

	}

}