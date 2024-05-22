package Basics.SuperClass;

public class CheckSuperClass {

	public static void main(String[] args) {
		String name="Poonam Pradhan";
		System.out.println(name);
		System.out.println(name.getClass());
		System.out.println(name.hashCode());
		
		if(name instanceof Object) {
			System.out.println("Yes name variable does extend Object class");
		}else {
			System.out.println("No it doesnt extend Object.There is something wrong.");
		}
	}

}
