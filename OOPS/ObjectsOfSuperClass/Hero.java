package OOPS.ObjectsOfSuperClass;

public class Hero extends Actor{
	
	public void fight() {
		System.out.println("Fighting Scene");
	}

	public static void main(String[] args) {
		Hero hem=new Hero();
		hem.fight();
		hem.act();// inheritance
	}
}
