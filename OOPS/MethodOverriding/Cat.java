package OOPS.MethodOverriding;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Cat() {
		super();
	}
	public void sound()
	{
		System.out.println("Meow Meow!!");
	}
	public static void main(String[] args) {
		Cat c=new Cat("Kitty");
		c.getName();
		c.sound();
		Cat c2=new Cat();
		c2.setName("Cutie Pie");
		System.out.println("Second cat's name is : "+c2.getName());

	}

}
