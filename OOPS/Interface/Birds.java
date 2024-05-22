package OOPS.Interface;

public abstract class Birds implements Flyable{
	
	String name;
	
	public void wings() {
		System.out.println("Birds have wings");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public abstract void fly();
}
