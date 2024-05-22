package OOPS.ObjectsOfSuperClass;

public class MainClass {
	
	public static void main(String[] args) {
		Actor actor1=new Hero();
		actor1.act();
		((Hero)actor1).fight();
	//	((Comedian)actor1).comedy(); //java.lang.ClassCastException:
		Actor actor2=new Comedian();
		Actor actor3=new Actor();
		
	}
}
