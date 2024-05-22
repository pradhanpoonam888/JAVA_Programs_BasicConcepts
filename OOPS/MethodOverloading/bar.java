package OOPS.MethodOverloading;

public class bar extends foo {
	
	public void doit(int i , int j) {
		System.out.println("From CLass BAR :: only int value sum of  " + i + " + " + j +" = "+(i+j));
	}
	
	

	public static void main(String[] args) {
		bar b=new bar();
		b.doit(23);
		b.doit(23.45f);
		b.doit(34, 76);
		b.doit(34.12f, 75.98f);
	}

}
