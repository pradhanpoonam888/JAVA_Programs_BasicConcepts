package OOPS.Interface;

public class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Aeroplane can fly");

	}

	public static void main(String[] args) {
		Aeroplane a=new Aeroplane();
		a.fly();

	}

}
