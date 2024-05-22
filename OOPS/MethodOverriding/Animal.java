package OOPS.MethodOverriding;

public class Animal {
	
	String name;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Name of the Animal is : "+ name);
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public void sound()
	{
		System.out.println("Un known Sound for the given Animal!!!");
	}

	public static void main(String[] args) {
		Animal a=new Animal("Generic");
		a.sound();
	}

}
