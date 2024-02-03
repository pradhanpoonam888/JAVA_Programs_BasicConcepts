package exceptions;

public class JavaExceptionsExample {
	
	public static void main(String [] args) {
		try {
		int i=10/0;
		}catch( java.lang.ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("After Exception this should be executed.");
		}
		
	}

}
