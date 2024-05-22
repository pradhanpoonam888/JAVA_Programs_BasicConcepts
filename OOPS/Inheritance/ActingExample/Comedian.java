package OOPS.Inheritance.ActingExample;

public class Comedian extends Actor{
	
	public void comedy() {
		System.out.println("Comedy Sence");
	}

	public static void main(String[] args) {
		Comedian com=new Comedian();
		com.comedy();
		
		com.act();

	}

}
