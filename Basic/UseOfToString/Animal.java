package Basic.UseOfToString;

public class Animal {
	
	String name;
	String type;
	
	public Animal(String name, String type) {
		this.name=name;
		this.type=type;
	}
	
	public String toString() {
        return getClass().getName() + "@" + "\n" + "Name of the Animal : " + name 
        + "\n"+"Type of Animal : " + type;
        
    }

	public static void main(String[] args) {
		Animal a= new Animal("Teddy", "Bear");
		System.out.println(a);
		System.out.println(a.toString());

	}

}
