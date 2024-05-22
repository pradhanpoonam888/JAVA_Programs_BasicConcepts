package OOPS.Interface;

public class Penguin extends Birds{

	public Penguin(String string) {
		super.name = string;
	}

	@Override
	public void fly() {
		System.out.println("Penguins cannot fly");
		
	}

	public static void main(String[] args) {
		System.out.println("****** Penguins ********");
		Penguin p=new Penguin("Penguin");
		p.fly();
		p.setName("Old Penguin");
		System.out.println(p.getName());
		p.wings();
		
		System.out.println("****************");
	}
}
