package OOPS.Interface;

public interface Flyable {

	String className = "Flyable";

	public void fly();

	default void getClassName() {

		System.out.println(className);
		;

	}
}
